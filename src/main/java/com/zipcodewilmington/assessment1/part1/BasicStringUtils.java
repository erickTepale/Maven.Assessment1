package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String [] arr = str.split("");
        arr[0] = arr[0].toUpperCase();

        return String.join("", arr);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String [] arr = str.split("");
        String [] rev = new String [arr.length];

        for (int i = 0; i < arr.length ; i++) {
            rev[i] = arr[arr.length - i - 1];
        }
        return String.join("", rev);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String [] arr = str.split("");
        String [] trim = new String[arr.length - 2];
        System.arraycopy(arr, 1, trim,0, arr.length - 2);

        return String.join("", trim);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char [] split = str.toCharArray();

        for (int i = 0; i <split.length ; i++) {
            if(Character.isLowerCase(split[i])){
                split[i] = Character.toUpperCase(split[i]);
            }
            else if(Character.isUpperCase(split[i])){
                split[i] = Character.toLowerCase(split[i]);
            }
        }
        return String.valueOf(split);
    }
}
