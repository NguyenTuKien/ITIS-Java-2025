package Tools;

import java.io.IOException;
import java.util.Scanner;

public class ZipLinux {

    static Scanner cin = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String folder = cin.next();
        String zipFile = folder + "/" + folder + ".zip";
        ProcessBuilder pb = new ProcessBuilder("zip", "-r", zipFile, folder);
        pb.inheritIO();
        Process process = pb.start();
    }
}