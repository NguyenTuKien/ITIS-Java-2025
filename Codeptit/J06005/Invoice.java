package J06005;

public class Invoice {
    String id;
    Customer customer;
    Item item;
    int quantity;

    public Invoice(int id, Customer customer, Item item, int quantity){
        this.id = String.format("HD%03d", id);
        this.customer = customer;
        this.item = item;
        this.quantity = quantity;
    }

    public int getTotal(){
        return quantity * item.getPrice();
    }

    @Override
    public String toString(){
        return id + " " + customer.toString() + " " + item.toString() + " " + quantity + " " + this.getTotal();
    }
}
