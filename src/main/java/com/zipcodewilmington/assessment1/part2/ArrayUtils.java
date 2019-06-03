package com.zipcodewilmington.assessment1.part2;

//import org.graalvm.compiler.nodes.calc.ObjectEqualsNode;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int counter = 0;
        for(Object arr : objectArray){
            if(arr.equals(objectToCount))
                counter++;
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    //Casting error, right answer thoe ?
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Object> workingCopy = new ArrayList<>();

        for(int i = 0; i<objectArray.length; i++){
            if(!objectArray[i].equals(objectToRemove)){
                workingCopy.add(objectArray[i]);
            }
        }
        Object [] last = new Object[workingCopy.size()];
        workingCopy.toArray(last);
        for (Object i: last) System.out.println(i);

        return last;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    //correct answer bad casting ?
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer totalLength = objectArray.length + objectArrayToAdd.length;
        Integer counter = 0;
        Object [] result = new Object[totalLength];

        for (int i = 0; i < totalLength; i++) {
            if (i < objectArray.length){
                result[i] = objectArray[i];
            }
            else {
                result[i] = objectArrayToAdd[counter];
                counter++;
            }
            System.out.print(result[i]);
        }

        return result;
    }
}
