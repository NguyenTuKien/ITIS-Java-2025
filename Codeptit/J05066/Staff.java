package J05066;

public class Staff implements Comparable<Staff>{
    String name, pos, id, level;
    Staff(String staffId, String name){
        this.name = name;
        this.pos = staffId.substring(0, 2);
        this.level = staffId.substring(2, 4);
        this.id = staffId.substring(4);
    }

    public String getName() {
        return name;
    }

    public String getId(){
        return id;
    }

    public String getLevel() {
        return level;
    }

    @Override
    public int compareTo(Staff o) {
        if (o.getLevel().equals(this.getLevel())) {
            return this.getId().compareTo(o.getId());
        }
        return o.getLevel().compareTo(this.getLevel());
    }

    @Override
    public String toString() {
        return name + " " + pos + " " + id + " " + level;
    }

}
