package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

import java.util.ArrayList;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer palindromeCounter = 0;

        //first find all the subsets
        String [] subsets = findAllSubsets(input);

        //check if each is a palindrome
        for (String i : subsets) {
            if(isPalindrome(i))
                palindromeCounter++;
        }

        return palindromeCounter;
    }

    public String[] findAllSubsets(String input){
        String [] og = input.split("");
        String builder = "";
        ArrayList<String> sub = new ArrayList<>();

        // Pick starting point
        for (int len = 1; len <= og.length; len++) {
            // Pick ending point
            for (int i = 0; i <= og.length - len; i++) {
                //  Print characters from current
                // starting point to current ending
                // point.
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    builder += og[k];
                }
                sub.add(builder);
                builder = "";
            }
        }

        String [] finalz = new String [sub.size()];
        sub.toArray(finalz);
        return finalz;
    }

    public Boolean isPalindrome(String substring){
        String rev = BasicStringUtils.reverse(substring);

        return substring.equals(rev);
    }
}
