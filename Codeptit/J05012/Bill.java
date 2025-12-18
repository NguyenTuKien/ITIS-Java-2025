package J05012;
public class Bill implements Comparable<Bill> {
    String id;
    String name;
    int amount;
    long price;
    long discount;

    public Bill(String id, String name, int amount, long price, long discount){
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.discount = discount;
    }

    public long getTotal(){
        return price * amount - discount;
    }

    @Override
    public int compareTo(Bill o) {
        return Long.compare(o.getTotal(), this.getTotal());
    }

    @Override
    public String toString(){
        return this.id + " " + this.name + " " +  String.valueOf(this.amount) + " " + String.valueOf(this.price) + " " + String.valueOf(this.discount) + " " + String.valueOf(this.getTotal());
    }
}
