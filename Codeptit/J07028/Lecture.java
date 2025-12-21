package J07028;

public class Lecture {
    private String id, name;
    private double totalHours;

    public Lecture(String id, String name){
        this.id = id;
        this.name = name;
        this.totalHours = 0;
    }

    public void addHour(double hours){ totalHours += hours; }

    public String getId(){ return id; }

    @Override
    public String toString(){
        return name + " " + String.format("%.02f", totalHours);
    }
}
