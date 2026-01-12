public class Room {
    private int number;
    private RoomType type;
    private Guest occupant;
    private boolean occupied;

    public Room(int number, RoomType type) {
        this.number = number;
        this.type = type;
        this.occupied = false;
        this.occupant = null;
    }

    public void checkIn(Guest guest) {
        if (occupied) {
            throw new IllegalStateException("Room is already occupied");
        }
        this.occupant = guest;
        this.occupied = true;
    }

    public void checkOut() {
        this.occupant = null;
        this.occupied = false;
    }

    public int getNumber() { return number; }
    public boolean isOccupied() { return occupied; }
}