package test.one.anagram;

import java.util.Arrays;

public class AnagramChecker {

    public boolean isAnagram(String firstString, String secondString){
        boolean isAnagram=true;
        char[] firstArray= getCharArray(firstString);
        char[] secondArray= getCharArray(secondString);
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        if(firstArray.length==secondArray.length){
            for(int i=0;i<firstArray.length;i++){
                if(firstArray[i]!=secondArray[i]){
                    isAnagram=false;
                    break;
                }
            }
        }else{
            isAnagram=false;
        }

        return isAnagram;
    }

    private char[] getCharArray(String string) {
        string=string.trim().replaceAll("\\s","").toLowerCase();
        return string.toCharArray();
    }
}
