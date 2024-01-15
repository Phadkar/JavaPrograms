package src.oops_13Jan2024.accessModifier.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop JrCop = new Cop(2);
        JrCop.canIShoot();
        //As canIShoot function is protected it is accessible to folder level
    }


}
