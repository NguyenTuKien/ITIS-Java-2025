package J06009;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

    private String id, name, sex, address;
    private Date dob;

    Client(int id, String name, String sex, String dob, String address) throws Exception{
        this.id = String.format("KH%03d", id);
        this.name = name;
        this.sex = sex;
        this.dob = sdf.parse(dob);
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
