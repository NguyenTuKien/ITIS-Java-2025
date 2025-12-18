package J07019;

public class Item {
    String id, name;
    double price1, price2;

    public Item(String id, String name, double price1, double price2){
        this.id = id;
        this.name = name;
        this.price1 = price1;
        this.price2 = price2;
    }

    public String getId(){
        return id;
    }

    public double getPrice(String type){
        if(type.equals("1")) return price1;
        else return price2;
    }

    public String getName(){
        return name;
    }
}
