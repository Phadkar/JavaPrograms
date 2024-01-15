package src.oops_13Jan2024.accessModifier.Police;

public class Cop {
    public int gun;

    public Cop(int gun){
        this.gun = gun;
    }

    //As canIShoot function is protected it is accessible to folder level
    protected void canIShoot(){
        System.out.println("OfCouse, you can shoot");
    }
}
