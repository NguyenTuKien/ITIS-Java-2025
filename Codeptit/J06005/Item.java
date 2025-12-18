package J06005;

public class Item {
    String id, name, unit;
    int buy, sell;

    public Item(int id, String name, String unit, int buy, int sell){
        this.id = String.format("MH%03d", id);
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
    }

    public String getId(){
        return id;
    }

    public int getPrice(){
        return sell;
    }

    @Override
    public String toString(){
        return name + " " + unit + " " + String.valueOf(buy) + " " + String.valueOf(sell);
    }
}
