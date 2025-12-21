package J05073;

public class Item {
    private String id;
    private int price, quantity;

    public Item(String id, int price, int quantity){
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTax(){
        double bas = 1.0 * price * quantity;
        if(id.startsWith("T")) return bas * 0.29;
        if(id.startsWith("C")) return bas * 0.1;
        if(id.startsWith("D")) return bas * 0.08;
        return bas * 0.02;
    }

    public double getShip(){
        double bas = 1.0 * price * quantity;
        if(id.startsWith("T")) return bas * 0.04;
        if(id.startsWith("C")) return bas * 0.03;
        if(id.startsWith("D")) return bas * 0.025;
        return bas * 0.005;
    }

    public double getTotal(){
        double bas = 1.0 * price * quantity;
        double tax = getTax();
        double ship = getShip();
        if(id.endsWith("C")) tax *= 0.95;
        return (bas + tax + ship) * 1.2 / quantity;
    }

    @Override
    public String toString(){
        return id + " " + String.format("%.02f", getTotal());
    }
}
