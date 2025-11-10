package J04001;
import java.util.Scanner;

public class Main {
    public double distance(Point p, Point q){
        double dx = p.getX() - q.getX();
        double dy = p.getY() - q.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point p1 = new Point(x, y);
            x = sc.nextDouble();   
            y = sc.nextDouble();
            Point p2 = new Point(x, y);
            System.out.printf("%.4f\n", p1.distance(p2));
        }
        sc.close();
    }
}
