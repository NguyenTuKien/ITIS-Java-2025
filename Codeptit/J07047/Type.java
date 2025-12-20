package J07047;

public class Type {
    private String id, name;
    private double price, fee;
    public Type(String type, String name, double price, double fee){
        this.id = type;
        this.name = name;
        this.price = price;
        this.fee = fee;
    }
    public String getId() {
        return id;
    }
    public double getPrice() {
        return price;
    }
    public double getFee() {
        return fee;
    }
}
