import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Hotel {
    private String name;
    private List<Room> rooms;
    private List<Reservation> reservations;

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public String getName() { return name; }

    public boolean isRoomAvailable(RoomType type) {
        for (Room r : rooms) {
            // Check if room matches type and is not occupied
            if (r.getRoomType().getKind().equals(type.getKind()) && !r.isOccupied()) {
                return true;
            }
        }
        return false;
    }

    public Reservation createReservation(Date start, Date end, RoomType type, ReserverPayer payer) {
        int resNum = new Random().nextInt(999) + 1; // Generate random ID from 1 to 1000
        Reservation res = new Reservation(start, end, resNum);
        res.setPayer(payer);
        res.addRoomRequest(type, 1);
        
        reservations.add(res);
        return res;
    }
}