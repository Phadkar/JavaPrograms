package src.basics_07;

public class Lab130 {
    public static void main(String[] args) {
        String name = "Priyanka"; //String pool area
        String name2 = new String ("Priyanka"); // Heap area

        name = "Hadkar";

        String str1 ="Hello";
        str1= str1.concat(" Priyanka");
        System.out.println(str1);


    }
}
