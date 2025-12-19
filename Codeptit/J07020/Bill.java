package J07020;

public class Bill {
    String id;
    Customer customer;
    Item item;
    int quantity;

    public Bill(int id, Customer customer, Item item, int quantity){
        this.id = String.format("HD%03d", id);
        this.customer = customer;
        this.item = item;
        this.quantity = quantity;
    }

    int getTotal(){
        return item.getSell() * quantity;
    }

    @Override
    public String toString(){
        return id + " " + customer + " " + item + " " + quantity + " " + getTotal();
    }

}
