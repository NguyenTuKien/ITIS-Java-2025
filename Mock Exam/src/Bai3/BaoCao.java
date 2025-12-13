package Bai3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BaoCao implements Comparable<BaoCao>{
    private final DateTimeFormatter outForm = DateTimeFormatter.ofPattern("HH'h'mm");
    private final BaiTap baiTap;
    private final LocalTime time;

    public BaoCao(BaiTap baiTap, String time) throws Exception{
        this.baiTap = baiTap;
        DateTimeFormatter inForm = DateTimeFormatter.ofPattern("HH:mm");
        this.time = LocalTime.parse(time, inForm);
    }

    @Override
    public int compareTo(BaoCao o) {
        return time.compareTo(o.time);
    }

    @Override
    public String toString(){
        return baiTap.toString() + " " + outForm.format(time);
    }
}
