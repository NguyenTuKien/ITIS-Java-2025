package J07020;

public class Customer {
    String id, name, sex, dob, address;

    public Customer(int id, String name, String sex, String dob, String address) {
        this.id = String.format("KH%03d", id);
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
    }

    public String getId(){
        return this.id;
    }

    @Override
    public String toString(){
        return name + " " + address;
    }
}
