package Bai3;

public class BaiTap {
    private String studentId;
    private String studentName;
    private String topic;

    public BaiTap(String studentId, String studentName, String topic) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.topic = topic;
    }

    public String getStudentId() {
        return studentId;
    }

    public String toString(){
        return studentId + " " + studentName + " " + topic;
    }
}
