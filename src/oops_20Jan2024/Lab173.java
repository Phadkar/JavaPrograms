package src.oops_20Jan2024;

import java.io.FileReader;

public class Lab173 {
    public static void main(String[] args) {
        int a = 10/0;
        try {
            FileReader fileReader = new FileReader("c://priyanka.txt");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
