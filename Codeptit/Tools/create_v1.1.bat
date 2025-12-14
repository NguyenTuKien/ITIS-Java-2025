@echo off

mkdir %1
cd %1

echo package %1;> Main.java
echo public class Main {>> Main.java
echo    public static void main(String[] args) { >> Main.java
echo    } >> Main.java
echo }>> Main.java

shift
:loop
if "%1"=="" goto end

echo public class %1 {> %1.java
echo }>> %1.java

shift
goto loop
:end

@REM ./Tools/create_v1.0 <TÊN PACKAGE> <TÊN CÁC CLASS CẦN TẠO>
