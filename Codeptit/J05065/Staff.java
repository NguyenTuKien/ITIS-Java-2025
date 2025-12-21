package J05065;

public class Staff implements Comparable<Staff>{
    String name, pos, id, level;
    Staff(String pos, int id, String level, String name){
        this.name = name;
        this.pos = pos;
        this.level = level;
        this.id = String.format("%03d", id);
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

    public String getPos(){ return pos; }
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
