package src.oops_07Jan_2024;

public class Lab144 {
    public static void main(String[] args) {


        BankAccount sbi = new BankAccount();
        sbi.printDetails();

        BankAccount hdfc = new BankAccount("HDFC", "HDFC023");
        hdfc.printDetails();

        BankAccount ICICI = new BankAccount("ICICI", "ICICI45");
        ICICI.bankCode = "ICICI78";
        ICICI.printDetails();

    }


}
