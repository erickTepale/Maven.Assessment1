package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    //                  flag height, custom jump height
    public int jumps(int k, int j) {
        Integer maxJumpCustom = k / j;
        Integer remainder = k % j;
        
        return (maxJumpCustom + remainder);
    }
}
