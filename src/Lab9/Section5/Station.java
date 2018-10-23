package Lab9.Section5;

public class Station {
    protected String name;
    protected int cost;

    public Station(String name, int cost) { // เพิ่มสถานี
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
