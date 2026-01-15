import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reservation {
    private Date reservationDate;
    private Date startDate;
    private Date endDate;
    private int number;
    private ReserverPayer payer;
    private List<HowMany> roomDetails;

    public Reservation(Date startDate, Date endDate, int number) {
        // Defensive: Check dates
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Dates cannot be null");
        }
        if (endDate.before(startDate)) {
            throw new IllegalArgumentException("End date must be after start date");
        }
        
        this.reservationDate = new Date(); // Current date
        this.startDate = startDate;
        this.endDate = endDate;
        this.number = number;
        this.roomDetails = new ArrayList<>();
    }

    public void setPayer(ReserverPayer payer) {
        this.payer = payer;
    }

    public void addRoomRequest(RoomType type, int count) {
        roomDetails.add(new HowMany(count, type));
    }

    public int getNumber() { return number; }
}

@Override
    public String toString() {
        return "Reservation #" + number + " for " + startDate.toString();
    }