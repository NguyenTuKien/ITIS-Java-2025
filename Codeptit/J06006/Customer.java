package J06006;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Customer {
    String id, name, address, sex;
    LocalDate dob;
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    public Customer(int id, String name, String sex, String dob, String address) throws Exception{
        this.id = String.format("KH%03d", id);
        this.name = name;
        this.sex = sex;
        this.dob = LocalDate.parse(dob, DATE_FORMATTER);
        this.address = address;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString(){
        return name + " " + address;
    }
}
