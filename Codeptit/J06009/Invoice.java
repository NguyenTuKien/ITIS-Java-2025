package J06009;

public class Invoice {
    private String id;
    private Client client;
    private Item item;
    private int quantity;

    Invoice(int id, Client client, Item item, int quantity){
        this.id = String.format("HD%03d", id);
        this.client = client;
        this.item = item;
        this.quantity = quantity;
    }

    public int getTotalCost(){
        return quantity * item.getSellingPrice();
    }

    @Override
    public String toString(){
        return id + " " + client + " " + item + " " + quantity + " " + getTotalCost();
    }
}
