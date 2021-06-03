import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArraysLec {
    // simple for loop example
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers [1] = 33;

        //out of range --> something about push and pull --> arrays are not dynamic, their static
       // numbers [11] = 73;

        //advanced way to write a for loop array in java
        for (int number : numbers) {
            System.out.println(number);
        }
        //basic most recognizable loop for an array
//        for (int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

        // array of strings

        String [] topFiveVideoGames = new String[5];

        topFiveVideoGames [0] = "Mass Effect";
        topFiveVideoGames [1] = "Mass Effect 2";
        topFiveVideoGames [2] = "Mass Effect 3";
        topFiveVideoGames [3] = "Fire Emblem";
        topFiveVideoGames [4] = "Dishonored";

        for (String name : topFiveVideoGames){
            System.out.println(name);
        }
    }

//    boolean[] lookingAtDefaultVals = new boolean[3];
//
//        for (boolean boo : lookingAtDefaultVals) {
//        System.out.println(boo);
//
//
//
//    }

//    int [] alsoNums = {11,12,45,68};
//
//    for (int number : numbers) {
//        System.out.println(number);
//    }
//
//    for (int number : alsoNums) {
//        System.out.println(number);
//    }
//    System.out.println ()




}
