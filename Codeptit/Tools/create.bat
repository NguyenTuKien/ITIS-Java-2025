@echo off

mkdir %1
cd %1

echo package %1;> Main.java
echo public class Main {>> Main.java
echo    public static void main(String[] args) { >> Main.java
echo    } >> Main.java
echo }>> Main.java
