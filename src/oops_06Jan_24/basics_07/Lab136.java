package src.oops_06Jan_24.basics_07;

//reverse using StringBuilder
public class Lab136 {
    public static void main(String[] args) {
        //If something is threadsafe we avoid
        //StringBuffer vs StringBuilder

        StringBuilder sb = new StringBuilder("Priyanka");
        sb.reverse();
        System.out.println(sb);
    }
}
