package src.oops_20Jan2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab172 {
    public static void main(String[] args) throws Exception {
main ("Priyanka");
    }

    static void main (String a) throws Exception {

        FileReader fileReader = new FileReader(new File("C:/priyanka.txt"));
        if (a.equalsIgnoreCase(a)){
            throw new ArithmeticException();
        }
    }
}
