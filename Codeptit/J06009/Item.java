package J06009;

public class Item {
    private String id, name, unit;
    private int purchasePrice, sellingPrice;

    Item(int id, String name, String unit, int purchasePrice, int sellingPrice){
        this.id = String.format("MH%03d", id);
        this.name = name;
        this.unit = unit;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getId() {
        return id;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    @Override
    public String toString(){
        return name + " " + unit + " " + purchasePrice + " " + sellingPrice;
    }
}
