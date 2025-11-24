package J05036;

import java.text.DecimalFormat;

public class Item {
    private String id, name, unit;
    private int purchasePrice, quantity;

    Item(int id, String name, String unit, int purchasePrice, int quantity){
        this.id = String.format("MH%02d", id);
        this.name = name;
        this.unit = unit;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public int getShipmentPrice(){
        return Math.round(0.05f * purchasePrice * quantity);
    }

    public int getTotalPrice(){
        return purchasePrice * quantity + getShipmentPrice();
    }

    public int getSellingPrice(){
        return getTotalPrice() + Math.round(getTotalPrice() * 0.02f);
    }

    @Override
    public String toString(){
        return id + " " + name + " " + unit + " " + getShipmentPrice() + " " + getTotalPrice() + " " + getSellingPrice();
    }
}
