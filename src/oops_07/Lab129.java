package src.oops_07;

public class Lab129 {
    public static void main(String[] args) {
        String name = "Priyanka";
        String y = "";

        for( int i = name.length()-1; i>=0;i--){
            y = y+ name.charAt(i);
        }
        System.out.println(y);
    }
}
