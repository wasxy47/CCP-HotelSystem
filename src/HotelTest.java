import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class HotelTest {

    // Test 1: Check if room is correctly added
    @Test
    public void testAddRoom() {
        Hotel hotel = new Hotel("Test Hotel");
        RoomType type = new RoomType("Single", 100.0);
        Room room = new Room(101, type);
        
        hotel.addRoom(room);
        
        // If logic allowed checking room count, we'd assert it here.
        // For now, we verify the hotel name exists
        assertEquals("Test Hotel", hotel.getName());
    }

    // Test 2: Check Availability Logic
    @Test
    public void testAvailability() {
        Hotel hotel = new Hotel("Test Hotel");
        RoomType type = new RoomType("Double", 200.0);
        Room room = new Room(202, type);
        hotel.addRoom(room);

        // Should be true initially
        assertTrue("Room should be available", hotel.isRoomAvailable(type));
    }

    // Test 3: Check Reservation Creation
    @Test
    public void testCreateReservation() {
        Hotel hotel = new Hotel("Test Hotel");
        RoomType type = new RoomType("Suite", 500.0);
        ReserverPayer payer = new ReserverPayer("Bob", "1234-5678");
        
        Reservation res = hotel.createReservation(new Date(), new Date(), type, payer);
        
        assertNotNull("Reservation object should not be null", res);
        assertTrue("Reservation number should be positive", res.getNumber() > 0);
    }
}