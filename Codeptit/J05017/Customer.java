package J05017;

public class Customer implements Comparable<Customer>{
    private String id, name;
    private int old, cur;

    public Customer(int id, String name, int old, int cur){
        this.id = String.format("KH%02d", id);
        this.name = name;
        this.old = old;
        this.cur = cur;
    }

    public double getTotal(){
        int usage = cur - old;
        double total = 0;
        if (usage <= 50) {
            total = usage * 100;
        }
        else if (usage <= 100) {
            total += 50 * 100;
            total += (usage - 50) * 150;
        }
        else {
            total += 50 * 100;
            total += 50 * 150;
            total += (usage - 100) * 200;
        }
        if (usage <= 50) return total * 1.02;
        else if (usage <= 100) return total * 1.03;
        else return total * 1.05;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + String.format("%.0f", getTotal());
    }

    @Override
    public int compareTo(Customer o){
        return Double.compare(o.getTotal(), getTotal());
    }
}
