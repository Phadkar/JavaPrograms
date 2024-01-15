package src.oops_13Jan2024.encapsulation;

public class IciciBank {
    String name;
    long bal;

    public IciciBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        if(bal>0) {
            this.bal = bal;
        }else{
            System.out.println("Not allowed");
        }
    }
}
