package src.oops_14thJan2024.exceptions;

public class Lab165 {
    public static void main(String[] args) {
        try {
            String ip = args[0];
            int a = Integer.parseInt(args[0]);
            int b = 10 / a;
            System.out.println(a);
            System.out.println(b);
        }catch(NullPointerException| ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
finally {
            System.out.println("I will be executed anyhow");
        }
    }
}
