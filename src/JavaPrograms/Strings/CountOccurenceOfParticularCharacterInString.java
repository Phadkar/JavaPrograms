package src.JavaPrograms.Strings;

public class CountOccurenceOfParticularCharacterInString {
    public static void main(String[] args) {
        String s = "Priyanka";
        String str = s.toLowerCase();
        char[] charArray = str.toCharArray();
        int occurance = 0;
        char toFind = 'a';
        for (int i = 0; i < charArray.length ; i++) {
if(toFind == charArray[i]){
    occurance++;
}
        }
        System.out.println("Character " +toFind+" present " +occurance +" times.");
    }
}
