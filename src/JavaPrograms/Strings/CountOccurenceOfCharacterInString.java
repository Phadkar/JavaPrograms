package src.JavaPrograms.Strings;

import java.util.HashMap;

public class CountOccurenceOfCharacterInString {
    public static void main(String[] args) {
        String s = "aabbccddefghsfdfdg";
        char[] EverySingleCharFromWord = s.toCharArray();

        HashMap<Character,Integer> charcountMap= new HashMap<>();
        for (char character:EverySingleCharFromWord){
            {
if(charcountMap.containsKey(character)){
    charcountMap.put(character,charcountMap.get(character)+1);
            }
else{
    charcountMap.put(character,1);
}
            }
        }
        System.out.println(charcountMap);

    }
}
