package src.oops_06Jan_24.basics_07;

public class Lab131 {
    public static void main(String[] args) {
        String name = "Priyanka";
        System.out.println(name.concat(" hadkar"));
        System.out.println(name + " Hadkar");
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.contains("a"));
        System.out.println(name);

        String name2 = new String ("Pumpkin");

        String expected_result = "pass@123";
        String actual_result = "Pass@1234";
        if(expected_result.equalsIgnoreCase(actual_result)){
            System.out.println("Yes");
        }else{
            System.out.println("Not matched");
        }
    }
}
