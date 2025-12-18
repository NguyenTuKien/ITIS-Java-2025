import os, sys

package_name = sys.argv[1]
class_names = sys.argv[2:]

os.makedirs(package_name, exist_ok=True)
os.chdir(package_name)

with open("Main.java", "w", encoding="utf-8") as f:
    f.write(f"package {package_name};\n")
    f.write("public class Main {\n")
    f.write("    public static void main(String[] args) {\n")
    f.write("    }\n")
    f.write("}\n")

for cls in class_names:
    with open(f"{cls}.java", "w", encoding="utf-8") as f:
        f.write(f"package {package_name};\n")
        f.write(f"public class {cls} {{\n")
        f.write("}\n")

# python ./Tools/create.py <TEN FOLDER> <TEN CAC CLASS>
# vi du: python ./Tools/create.py J05081 Client Invoice Item