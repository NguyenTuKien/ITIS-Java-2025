package J07049;

public class Item {
    private String id, name;
    private int price, guarantee;
    public Item(String id, String name, int price, int guarantee) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.guarantee = guarantee;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getGuarantee() {
        return guarantee;
    }
}
