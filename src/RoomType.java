public class RoomType {
    private String kind;
    private double cost;

    public RoomType(String kind, double cost) {
        this.kind = kind;
        this.cost = cost;
    }

    public String getKind() { return kind; }
    public double getCost() { return cost; }
}