package Tools;

import java.io.IOException;
import java.util.Scanner;

public class ZipWindow {
    static Scanner cin = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        if (!cin.hasNext()) {
            System.out.println("Hãy nhập tên folder bạn cần zip");
        }
        String folder = cin.next();
        String zipFile = folder + "/" + folder + ".zip";
        ProcessBuilder pb = new ProcessBuilder("tar", "-acf", zipFile, folder);
        pb.inheritIO();
        Process process = pb.start();
    }
}