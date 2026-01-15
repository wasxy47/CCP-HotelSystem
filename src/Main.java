import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== HOTEL RESERVATION SYSTEM START ===");

        // 1. Setup Hotel Chain
        HotelChain chain = new HotelChain("Hilton Group");

        // 2. Setup a Hotel and Rooms
        Hotel myHotel = new Hotel("Iqra Grand");
        RoomType doubleType = new RoomType("Double", 150.0);
        
        myHotel.addRoom(new Room(101, doubleType));
        chain.addHotel(myHotel);
        
        System.out.println("System: Hotel 'Iqra Grand' initialized.");

        // 3. Register Guest
        Guest guest = new Guest("Abdul Wasay", "Karachi");
        System.out.println("System: Guest " + guest.getName() + " registered.");

        // 4. Test Reservation
        chain.makeReservation("Iqra Grand", new Date(), new Date(), doubleType, "Wasay_ID");
        
        System.out.println("=== SYSTEM TEST FINISHED ===");
    }
}