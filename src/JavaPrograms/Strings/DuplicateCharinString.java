package src.JavaPrograms.Strings;

public class DuplicateCharinString {
    public static void main(String[] args) {
        int[] arrayOne ={2,5,4,7,6};
        int[] arrayTwo ={2,5,4,7,6};

        boolean equalOrNot = true;
        if(arrayOne.length == arrayTwo.length)
        {
            for (int i = 0; i < arrayOne.length ; i++) {
                if(arrayOne[i] != arrayTwo[i])
                {
                    equalOrNot = false;
                }
            }
        }
        else {
            equalOrNot = false;
        }
        if (equalOrNot)
        {
            System.out.println("Arrays are equal");
        }
        else
        {
            System.out.println("Arrays are not equal");
        }
    }
}
