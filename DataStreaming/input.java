import java.io.*;

public class input {
    public static void main(String[] main) {
        try {
            BufferedWriter BR = new BufferedWriter(new FileWriter("one.txt"));
            BR.write("Hello World");
            BR.close();
            BufferedReader BW = new BufferedReader(new FileReader("one.txt"));
            String str;
            while ((str = BW.readLine) != null) {
                System.out.println(str);
            }
        } catch (Exception e) {
            System.out.println("caught exception");
        }
    }

}
