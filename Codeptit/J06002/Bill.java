package J06002;

public class Bill implements Comparable<Bill>{
    private String id, type;
    private Item item;
    private int quantity;

    public Bill(int id, String type, Item item, int quantity){
        this.id = String.format("-%03d", id);
        this.type = type;
        this.item = item;
        this.quantity = quantity;
    }

    public double getDiscount(){
        double total = 1.0 * item.getPrice(type) * quantity;
        if(quantity >= 150) return total * 0.5;
        if(quantity >= 100) return total * 0.3;
        if(quantity >= 50) return total * 0.15;
        return 0;
    }

    public double getRemain(){
        return 1.0 * item.getPrice(type) * quantity - getDiscount();
    }

    @Override
    public int compareTo(Bill o){
        return Double.compare(o.getRemain(), getRemain());
    }

    @Override
    public String toString(){
        return item.getId() + type + id + " " + item.getName() + " " + String.format("%.0f", getDiscount()) + " " + String.format("%.0f", getRemain());
    }
}
