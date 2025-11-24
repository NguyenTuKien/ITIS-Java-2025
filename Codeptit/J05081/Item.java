package J05081;

public class Item implements Comparable<Item> {
    private String id, name, unit;
    private int buy_price, sell_price;

    Item(int id, String name, String unit, int buy_price, int sell_price){
        this.id = String.format("MH%03d", id);
        this.name = name;
        this.unit = unit;
        this.buy_price = buy_price;
        this.sell_price = sell_price;
    }

    int getInterest(){
        return sell_price - buy_price;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + unit + " " + buy_price + " " + sell_price + " " + getInterest();
    }

    @Override
    public int compareTo(Item o){
        return o.getInterest() - this.getInterest();
    }
}
