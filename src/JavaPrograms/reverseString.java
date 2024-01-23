package src.JavaPrograms;

public class reverseString {
    public static void main(String[] args) {
        String str = "MyJava";

        //Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());

        //Using for loop
        char[] strArray = str.toCharArray();
        for(int i= strArray.length-1;i>=0;i--){
            System.out.print(strArray[i]);
        }

        System.out.println(recursiveMethod(str));
    }
    //Recursive method to reverse String
    static String recursiveMethod(String str)
    {
        if( (null == str || str.length() <= 1)) {
            return str;
        }
        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}
