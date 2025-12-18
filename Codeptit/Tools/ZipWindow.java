package Tools;

import java.io.IOException;
import java.util.Scanner;
// Chạy file sau đó nhập folder cần zip
public class ZipWindow {
    static Scanner cin = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String folder = cin.next();
        String zipFile = folder + "/" + folder + ".zip";
        ProcessBuilder pb = new ProcessBuilder("tar", "-acf", zipFile, folder);
//        pb.inheritIO();
        Process process = pb.start();
    }
}