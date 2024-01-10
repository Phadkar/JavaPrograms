package src.oops_07Jan_2024;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;

    BankAccount(){
        bankName = "SBI";
        bankCode = "SBI001";
    }

    BankAccount( String bName, String bankCode){
        this.bankName = bName;
        this.bankCode = bankCode;
    }

    void printDetails(){
        System.out.println("BankName -->" +bankName);
        System.out.println("Balance -->" +balance);
        System.out.println("Bank Code -->" +bankCode);
    }
}
