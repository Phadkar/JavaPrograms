package src.oops_14thJan2024.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab168 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "abc.txt";
        File file = new File(path);
        FileReader fr = new FileReader(file);
    }
}
