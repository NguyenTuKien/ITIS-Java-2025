package J05066;

public class Staff implements Comparable<Staff> {
    private String name;
    private String code;
    private String pos;
    private String level;
    private String id;

    public Staff(String code, String name) {
        this.code = code;
        this.name = name;
        this.pos = code.substring(0, 2);
        this.level = code.substring(2, 4);
        this.id = code.substring(4);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getLevel() {
        return level;
    }

    @Override
    public int compareTo(Staff o) {
        // So sánh theo level giảm dần
        int levelCompare = Integer.parseInt(o.level) - Integer.parseInt(this.level);
        if (levelCompare != 0) {
            return levelCompare;
        }
        // Nếu level bằng nhau, so sánh theo id tăng dần
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return name + " " + pos + " " + id + " " + level;
    }
}
