package src.oops_20Jan2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab171 {
    public static void main(String[] args) throws Exception {
readFile("C://priyanka.txt");
    }
    static void readFile(String filename) throws Exception {
        File f = new File(filename);
        FileReader fileReader= new FileReader(filename);
if(filename.length()==0){
    throw new FileNotFoundException();
}
        System.out.println("not vul code");
int a = 10/0;
    }

}
