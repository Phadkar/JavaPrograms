package src.oops_07;

public class Lab117 {
    public static void main(String[] ref_name) {
        System.out.println("Fine!!!!!!!!!!");
        int d = main (14);
        System.out.println(d);
        main("Pramod");

    }
    static void main(String a){
        System.out.println("I am a Main function but JVM doesn't recognize me");
    }

    static int main (int a){
        return a+101;
    }
}
