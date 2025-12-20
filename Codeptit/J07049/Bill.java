package J07049;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bill implements Comparable<Bill>{
    private String id, name, address;
    private Item item;
    private int quantity;
    private LocalDate purchaseDate;
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public Bill(int id, String name, String address, Item item, int quantity, String purchaseDate) {
        this.id = String.format("KH%02d", id);
        this.name = name;
        this.address = address;
        this.item = item;
        this.quantity = quantity;
        this.purchaseDate = LocalDate.parse(purchaseDate, dtf);
    }
    public int getTotal(){
        return quantity * item.getPrice();
    }
    public LocalDate getExpireDate(){
        return purchaseDate.plusMonths(item.getGuarantee());
    }
    @Override
    public int compareTo(Bill o){
        return this.getExpireDate().compareTo(o.getExpireDate());
    }
    @Override
    public String toString(){
        return id + " " + name + " " + address + " " + item.getId() + " " + getTotal() + " " + getExpireDate().format(dtf);
    }
}
