import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelChain {
    private String name;
    private List<Hotel> hotels;
    private List<ReserverPayer> payers;

    public HotelChain(String name) {
        this.name = name;
        this.hotels = new ArrayList<>();
        this.payers = new ArrayList<>();
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public void makeReservation(String hotelName, Date start, Date end, RoomType type, String payerName) {
        Hotel targetHotel = findHotel(hotelName);
        if (targetHotel == null) {
            System.out.println("Error: Hotel " + hotelName + " not found.");
            return;
        }

        // 1. Check availability
        if (targetHotel.isRoomAvailable(type)) {
            // 2. Create Payer
            ReserverPayer payer = new ReserverPayer(payerName, "Unknown-Card");
            payers.add(payer);
            
            // 3. Create Reservation
            Reservation res = targetHotel.createReservation(start, end, type, payer);
            System.out.println("Success: Reservation #" + res.getNumber() + " created at " + hotelName);
        } else {
            System.out.println("Fail: No rooms available at " + hotelName);
        }
    }

    private Hotel findHotel(String name) {
        for (Hotel h : hotels) {
            if (h.getName().equals(name)) return h;
        }
        return null;
    }
}