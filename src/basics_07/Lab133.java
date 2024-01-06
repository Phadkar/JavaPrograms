package src.basics_07;

public class Lab133 {
    public static void main(String[] args) {
        //Immutable in nature
        String s1 = "Priyanka";
        String s2= new String ("Priyanka");

        //Mutable - that can be changed

        StringBuilder sb3 = new StringBuilder("Priyanka");
        sb3.append(" Hadkar");
        System.out.println(sb3);


        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);
    }
}
