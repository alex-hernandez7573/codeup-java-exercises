package Util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner;
//    private Scanner scanner;


  public String getString() {
      return this.scanner.nextLine();
  }


    public String getString (String userInput) {
        if(userInput.isEmpty()){
            System.out.println("Input Text Now");
        }else{
            System.out.println(userInput);
        }
//        System.out.println("Alert");
        return getString();
    }

    public boolean yesNo () {
        System.out.println("Y or N?");
        String userInput = this.scanner.nextLine();
        return userInput.equals("y") || userInput.equals("yes");
    }

    public int getInt () {
        System.out.println("Enter an Integer");
        return this.scanner.nextInt();
    }

    public double getDouble () {
        System.out.println("Enter some number with a decimal value");
        return this.scanner.nextDouble();
    }

    public int getInt (int min, int max){
        int userInt = getInt();
        if(userInt >= min && userInt <= max){
            System.out.println("You put "+userInt+", which is within the range of "+min+" and "+max);
            return userInt;
        }else {
            System.out.println("number is out of range, try again");
            return getInt(min,max);
        }
    }

    public double getDouble (double min, double max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max){
            System.out.println("You put "+userDouble+", which is within the range of "+min+" and "+max);
        }else{
            System.out.println("number is out of range, try again");
        }
        return getDouble(min, max);
    }








}
