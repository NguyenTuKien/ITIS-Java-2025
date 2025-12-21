package J05071;

public class Area {
    private String id, name;
    private int price;

    public Area(String id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId(){ return id; }

    public String getName(){ return name; }

    public int getPrice(){ return price; }
}
