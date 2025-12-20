package J05066;

public class Staff implements Comparable<Staff> {
    private String name;
    private String pos;       // Chức vụ (Có thể bị thay đổi thành NV)
    private String salaryStr; // Chuỗi hệ số lương (để in ra, vd: "08")
    private long salaryVal;   // Giá trị lương (để sắp xếp, vd: 8)
    private String id;        // Số hiệu (vd: "001")

    public Staff(String inputCode, String name) {
        this.name = name;
        // Cắt chuỗi: GD08001
        this.pos = inputCode.substring(0, 2);       // GD
        this.salaryStr = inputCode.substring(2, 4); // 08
        this.id = inputCode.substring(4);           // 001

        this.salaryVal = Long.parseLong(this.salaryStr);
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Staff o) {
        // 1. Sắp xếp hệ số lương giảm dần
        if (this.salaryVal != o.salaryVal) {
            return Long.compare(o.salaryVal, this.salaryVal);
        }
        // 2. Sắp xếp số hiệu tăng dần
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return name + " " + pos + " " + id + " " + salaryStr;
    }
}