package src.JavaPrograms;

import java.util.Arrays;

public class SecondLargestInArray {
    public static int getSecondLargest(int[]a,int total){
        Arrays.sort(a);
        return a[total-2];
    }

    public static void main(String[] args) {
        int[]a ={ 3,4,5,6,7};
        int[]b = {34,56,76,87,34,12};
        System.out.println("Second Largest: "+getSecondLargest(a,5));
        System.out.println("Second Largest: "+getSecondLargest(b,6));
    }
}
