package J06001;

public class Bill {
    private String id, type;
    private Item item;
    private int quantity;

    public Bill(int id, String type, Item item, int quantity){
        this.id = item.getId() + type + String.format("-%03d", id);
        this.type = type;
        this.item = item;
        this.quantity = quantity;
    }

    public int getTotal(){
        return item.getPrice(type) * quantity;
    }

    public double getDiscount(){
        if (quantity >= 150) return 0.5 * getTotal();
        else if (quantity >= 100) return 0.3 * getTotal();
        else if (quantity >= 50) return 0.15 * getTotal();
        else return 0;
    }

    @Override
    public String toString(){
        return id + " " + item.getName() + " " + String.format("%.0f", getDiscount()) + " " + String.format("%.0f", (getTotal() - getDiscount()));
    }
}
