package src.JavaPrograms.Strings;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
Anagram anagram = new Anagram();
anagram.findStringIsAnagram("silena", "listen");
    }
    public void findStringIsAnagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length()!=str2.length()){
            System.out.println("Given strings are not an Anagram");
        }else{
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            if(Arrays.equals(str1charArray,str2charArray )==true){
                System.out.println("Given strings are Anagram");
            }else{
                System.out.println("Given strings are not an Anagram");
            }
        }
    }
}
