package J05033;

public class Time implements Comparable<Time> {
    private int hh, mm, ss;

    public Time (int hh, int mm, int ss){
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }

    public void getInfo(){
        System.out.printf("%d %d %d\n", this.hh, this.mm, this.ss);
    }

    @Override
    public int compareTo(Time other) {
        if (this.hh != other.hh) return this.hh - other.hh;
        if (this.mm != other.mm) return this.mm - other.mm;
        return this.ss - other.ss;
    }
}
