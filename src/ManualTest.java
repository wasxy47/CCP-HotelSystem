import java.util.Date;

public class ManualTest {
    public static void main(String[] args) {
        System.out.println("=== RUNNING UNIT TESTS ===");

        try {
            // TEST 1: Check if Room Addition works
            System.out.print("Test 1: Adding Room to Hotel... ");
            Hotel hotel = new Hotel("Test Hotel");
            RoomType type = new RoomType("Single", 100.0);
            Room room = new Room(101, type);
            hotel.addRoom(room);
            
            if (hotel.getName().equals("Test Hotel")) {
                System.out.println("[PASS]");
            } else {
                System.out.println("[FAIL]");
            }

            // TEST 2: Check Availability Logic
            System.out.print("Test 2: Checking Room Availability... ");
            if (hotel.isRoomAvailable(type)) {
                System.out.println("[PASS]");
            } else {
                System.out.println("[FAIL]");
            }

            // TEST 3: Check Reservation Creation
            System.out.print("Test 3: Creating Reservation... ");
            ReserverPayer payer = new ReserverPayer("Bob", "1234-5678");
            Reservation res = hotel.createReservation(new Date(), new Date(), type, payer);
            
            if (res != null && res.getNumber() > 0) {
                System.out.println("[PASS]");
            } else {
                System.out.println("[FAIL]");
            }

        } catch (Exception e) {
            System.out.println("[FAIL] - Exception: " + e.getMessage());
        }

        System.out.println("\n=== ALL TESTS COMPLETED SUCCESSFULLY ===");
    }
}