package src.oops_14thJan2024.exceptions;

import java.io.FileInputStream;

public class Lab164 {
    public static void main(String[] args) {
        //Unchecked exception, Runtime
        String name = null;
        name.trim();

        //Checked exception, Compile Time -/JVM? If JVM knows about it then it is checked exception
try {
    FileInputStream f = new FileInputStream("dsdsea.txt");
}catch (Exception e){

}

    }
}
