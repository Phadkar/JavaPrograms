package src.JavaPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DuplicateCharinString2 {
    public static void main(String[] args) {
        String[] s1 = {"java", "j2ee", "struts", "hibernate"};

        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};

        String[] s3 = {"java", "j2ee", "struts", "hibernate"};

        System.out.println(Arrays.equals(s1,s2));
        System.out.println(Arrays.equals(s1,s3));

        ////////////////////////
        System.out.println("Another method");
        Arrays.sort(s1);
        Arrays.sort(s2);
        Arrays.sort(s3);
        System.out.println(Arrays.equals(s1,s2));

        System.out.println("For MultiDimensional Array");

        //For multidimmesional we need to use deepEquals method
        String[][] s4 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };

        String[][] s5 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };

        System.out.println(Arrays.deepEquals(s4,s5));
    }
}
