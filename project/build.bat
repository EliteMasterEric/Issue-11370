REM Build all the Java files in the src/ folder into the out/ folder
javac -d out src/test/TestClass.java src/test/CoolClass.java
REM Create a JAR file from the compiled classes
cd out/
jar cf project.jar test/TestClass.class test/CoolClass.class test/CoolClass$Comment.class test/CoolClass$Entry.class
