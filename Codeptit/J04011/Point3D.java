package J04011;

public class Point3D {
    private int x, y, z;

    public Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4){
        int abX = p1.x - p2.x;
        int abY = p1.y - p2.y;
        int abZ = p1.z - p2.z;

        int acX = p1.x - p3.x;
        int acY = p1.y - p3.y;
        int acZ = p1.z - p3.z;

        int adX = p1.x - p4.x;
        int adY = p1.y - p4.y;
        int adZ = p1.z - p4.z;

        int nX = abY * acZ - abZ * acY;
        int nY = abZ * acX - abX * acZ;
        int nZ = abX * acY - abY * acX;

        int val = nX * adX + nY * adY + nZ * adZ;

        return val == 0;
    }
}
