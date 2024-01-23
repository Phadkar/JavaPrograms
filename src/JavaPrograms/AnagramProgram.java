package src.JavaPrograms;

import java.util.Arrays;

public class AnagramProgram {
static void isAnagram(String s1, String s2){
    String copyofs1 = s1.replaceAll("\\s+","");
    String copyofs2 = s2.replaceAll("\\s+","");
    boolean status = false;

    if(copyofs1.length() != copyofs2.length()){
        status = false;
    }
    else{
        char[] s1Array = copyofs1.toLowerCase().toCharArray();
        char[] s2Array = copyofs2.toLowerCase().toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        status = Arrays.equals(s1Array,s2Array);
    }
    if(status)
    {
        System.out.println(s1 +" and "+ s2 +" are anagram");
    }
    else{
        System.out.println(s1 +" and "+ s2 +" are not an anagram");
    }
}
    public static void main(String[] args) {
        isAnagram("Mother In Law", "Hitler Woman");

        isAnagram("keEp", "peeK");

        isAnagram("SiLeNt CAT", "LisTen AcT");

        isAnagram("Debit Card", "Bad Credit");

        isAnagram("School MASTER", "The ClassROOM");

        isAnagram("DORMITORY", "Dirty Room");

        isAnagram("ASTRONOMERS", "NO MORE STARS");

        isAnagram("Toss", "Shot");

        isAnagram("joy", "enjoy");
    }

}
