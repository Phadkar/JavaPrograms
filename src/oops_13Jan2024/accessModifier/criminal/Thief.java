package src.oops_13Jan2024.accessModifier.criminal;

import src.oops_13Jan2024.accessModifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop cop = new Cop(10);
        System.out.println(cop.gun);
      //  cop.canIShoot();
        //Thief is not in the protected police folder
    }


}
