package J05008;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Polygon {
    int n;
    List<Point> lp;

    public Polygon(int n){
        this.n = n;
        this.lp = new ArrayList<Point>();
    }

    public void addPoint(Scanner cin){
        for (int i = 0; i < n; i++){
            Point p = new Point(cin.nextDouble(), cin.nextDouble());
            lp.add(p);
        }
    }

    public double getSquare(){
        double square = 0;
        for (int i = 0; i < n; i++){
            int j = (i + 1) % n;
            square += lp.get(i).getX() * lp.get(j).getY()
                    - lp.get(i).getY() * lp.get(j).getX();
        }
        return Math.abs(square) / 2.0;
    }

}
