package Bai4;

public class SinhVien {
    private final String id;
    private final String name;
    private final String clss;
    private final String email;
    private final String phone;
    private final String sex;

    SinhVien(String id, String name, String clss, String email, String phone, String sex){
        this.id = id;
        this.name = name;
        this.clss = clss;
        this.email = email;
        this.phone = phone;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public String getSex(){
        return sex;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + clss + " " + email + phone;
    }
}
