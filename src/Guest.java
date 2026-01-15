public class Guest {
    private String name;
    private String addressDetails;

    public Guest(String name, String addressDetails) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
        this.addressDetails = addressDetails;
    }

    public String getName() { return name; }
    public String getAddressDetails() { return addressDetails; }

@Override
    public String toString() {
        return "Guest: " + name;
    }
}