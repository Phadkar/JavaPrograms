package src.oops_20Jan2024;

import java.util.List;

public class Lab178 {
    public static void main(String[] args) {
        //Collection Framework
        List fruits = List.of("Apple","Banana", "Watermelon","Apple","Chickoo");
        List Shopping_items = List.of("Flour","Vegetables","Silk");
        List Marks_10th = List.of(85,34,98,67);
        List diff_data_types = List.of("Priyanka", 67,true);

        System.out.println(fruits.get(1));
        System.out.println(fruits.size());
        System.out.println(fruits);
        System.out.println(fruits.indexOf("Chickoo"));

        System.out.println(fruits.isEmpty());
        //System.out.println(fruits.add("Peru"));
        //System.out.println(fruits.remove("Peru"));

    }
}
