package src.basics_06;

public class Lab111 {
    public static void main(String[] args) {
        int a[][] = new int[2][3];
        a[0][0] = 12 ;
        a[0][1] = 34;
        a[0][2] = 34 ;
        a[1][0] = 100;
        a[1][1] = 98;
        a[1][2] = 45;

        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
