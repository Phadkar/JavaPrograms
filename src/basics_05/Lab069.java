package src.basics_05;



public class Lab069 {
    public static void main(String[] args) {
        // JDK 13
        int itemCode = 002;
        switch (itemCode) {
            case 001, 002, 003:
                System.out.println("It's an electronic gadget!");
                break;
            case 004, 005:
                System.out.println("It's a mechanical device!");
            default:
                System.out.println("It's a software product!");
        }
    }
}
