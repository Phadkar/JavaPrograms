package src.basics_06;

public class Lab110 {
    public static void main(String[] args) {
        int []a = {12,34,456};
        //2D array
        int[][] arr1 = new int[3][3];
        arr1[0][0] = 12 ;
        arr1[0][1] = 34;
        arr1[0][2] = 34 ;
        arr1[1][0] = 100;
        arr1[1][1] = 98;
        arr1[1][2] = 45;
        arr1[2][0] = 1;
        arr1[2][1] = 43;
        arr1[2][2] = 45;

        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length ; j++) {
                System.out.print("\t" + arr1[i][j]);
            }
            System.out.println();
        }
    }
}
