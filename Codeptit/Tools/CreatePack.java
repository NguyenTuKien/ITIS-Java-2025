package Tools;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatePack {
    static Scanner cin = new Scanner(System.in);
    public static void main(String[] args) {
        if (!cin.hasNext()){
            System.out.println("Hãy nhập tên Folder và tên các Class");
        }
        String packageName = cin.next();
        File dir = new File(packageName);
        dir.mkdirs();
        createJavaFile(dir, packageName, "Main");
        while(cin.hasNext()){
            String className = cin.next();
            createJavaFile(dir, packageName, className);
        }
    }
    private static void createJavaFile(File dir, String packageName, String className) {
        File file = new File(dir, className + ".java");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("package " + packageName + ";\n\n");
            writer.write("public class " + className + " {\n");
            if (className.equals("Main")) {
                writer.write("    public static void main(String[] args) {\n");
                writer.write("    }\n");
            }
            writer.write("}\n");
        } catch (IOException e) {}
    }
}