package src.oops_14thJan2024.WrapperClasss;

import java.sql.SQLOutput;

public class Lab161 {
    public static void main(String[] args) {
        int a = 10;
        Integer x = Integer.valueOf(a);
        System.out.println(x);

        //We will be using collection framework which work only with class
        //Classes hate primitive data type.
        //So you have to use wrapper classes
        //In automation we will wrapper class

        Character ch = 'a';
        //unboxing : Character object to primitive conversion
        char c3 = ch;

        System.out.println(Integer.valueOf("45"));
        System.out.println(Integer.max(45,78));
        System.out.println(Integer.min(45,78));

    }
}
