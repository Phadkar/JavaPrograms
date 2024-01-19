package src.oops_14thJan2024.innerclass;

public class Lab153 {
    OOC ooc = new OOC();
    OOC.aswad ab = new OOC.aswad();
}

class OOC{
    static int a = 23;

    int b = 34;
    static class aswad{
        public void show(){
            System.out.println(a);
            //System.out.println(b);
        }

    }

}
