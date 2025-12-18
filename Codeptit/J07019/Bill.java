package J07019;

public class Bill {
    Item item;
    String type;
    int id, quantity;

    public Bill(Item item, int id, String type, int quantity){
        this.item = item;
        this.id = id;
        this.type = type;
        this.quantity = quantity;
    }

    public double getTotal(){
        return item.getPrice(type) * quantity;
    }

    public double getDiscount(){
        if(quantity >= 150) return getTotal() * 0.5;
        else if(quantity >= 100) return getTotal() * 0.3;
        else if(quantity >= 50) return getTotal() * 0.15;
        else return 0;
    }

    @Override
    public String toString(){
        return item.getId() + type + String.format("-%03d", id) + " " + item.getName() + " " + String.format("%.0f", getDiscount()) + " " + String.format("%.0f", getTotal() - getDiscount());
    }
}
