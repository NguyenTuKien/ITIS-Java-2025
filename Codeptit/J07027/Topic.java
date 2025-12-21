package J07027;

public class Topic {
    private int id;
    private String title;

    public Topic(int id, String title){
        this.id = id;
        this.title = title;
    }

    public int getId() { return id; }

    @Override
    public String toString(){
        return id + " " + title;
    }
}
