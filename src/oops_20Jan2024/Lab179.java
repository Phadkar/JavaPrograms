package src.oops_20Jan2024;

import java.util.ArrayList;
import java.util.List;

public class Lab179 {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("Java");
        myList.add("API");
        myList.add(true);
        myList.add("selenium");

        System.out.println(myList);
        myList.set(1,"API Testing");
        System.out.println(myList);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        for(Object o:myList){
            System.out.println(o);
        }

    }
}
