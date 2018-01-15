package oopsconcepts;

/*
This code is written by Long
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringDemo {
    private static String s = "It is a test string";

    public static String[] getWord (String s) {
        String[] s1 = s.split("\\s+"); //back splash escape: s is for space
        return s1;
    }

    public static String reverseString (String[] stringArrays) {
        String reversedString = new String();
        for (int i = 0; i < stringArrays.length; i++) {
            reversedString = reversedString.concat(stringArrays[stringArrays.length - i-1] + " ");
        }
        return reversedString;
    }

    public static char[] getChar (String s){
        char[] s2 = s.toCharArray();
        return s2;
    }

    public static String reverseChar (char[] characterArray) {
        String reverseChar = new String();
        for (int i = 0; i < characterArray.length; i++){
            reverseChar = reverseChar.concat(String.valueOf(characterArray[characterArray.length - i -1]));
        }
        return reverseChar;
    }

    public static void main (String [] args){
        System.out.println(s);
        String finalString = reverseString(getWord(s));
        System.out.println(finalString);
        String finalChar = reverseChar(getChar(s));
        System.out.println(finalChar);
    }
}
