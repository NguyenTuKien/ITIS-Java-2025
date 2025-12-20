package J06002;

public class Item {
    private String id, name;
    private int p1, p2;

    public Item(String id, String name, int p1, int p2){
        this.id = id;
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
    }

    public String getId(){
        return id;
    }

    public int getPrice(String type){
        if(type.equals("1")) return p1;
        return p2;
    }

    public String getName(){
        return name;
    }
}
