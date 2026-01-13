public class ReserverPayer {
    private String id;
    private String creditCardDetails;

    public ReserverPayer(String id, String creditCardDetails) {
        this.id = id;
        this.creditCardDetails = creditCardDetails;
    }

    public String getId() { return id; }
}