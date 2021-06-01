import java.util.Scanner;

public class MethodsExercises {
    // Basic arithmetic

    public static int addition  (int a , int b) {
        return a+b;
    }
    public static int subtraction  (int a , int b) {
        return a-b;
    }
    public static int multiplication (int a , int b) {
        return a*b;
    }
    public static int division (int a, int b) {
        return a/b;
    }
    public static int modulus (int a, int b){
        return a%b;
    }

//    bonus COME BACK multiplying with out *

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter between "+min+" and "+max);
        if(sc.hasNextInt()){
            int userInput = sc.nextInt();
            if (userInput >= min && userInput <= max){
                System.out.println("Valid, "+userInput+" is in between "+min+" and "+max);
            } else {
                System.out.println("out of range, try again.");
                return getInteger(min, max);
            }
        }else {
            System.out.println("not valid, bye bye!");
//            getInteger(min, max);
        }
    return 0;
    }

    public static void rollDice () {

        Scanner input = new Scanner(System.in);
        System.out.println("enter how sides of dice");
         int diceSide = input.nextInt();
         int diceOne = (int) (diceSide*Math.random());
         System.out.println("first dice---> "+diceOne);
         int diceTwo = (int)  (diceSide*Math.random());
         System.out.println("second dice---> "+diceTwo);
    }

    public static void main(String[] args) {
        System.out.println(addition(5,5)+" :Addition");
        System.out.println(subtraction(10,5)+" :Subtraction");
        System.out.println(multiplication(5,5)+" :Multiplication");
        System.out.println(division(35,5)+" :division");
        System.out.println(modulus(35,2)+" :modulus");
//        System.out.println(getInteger(0,10));
        rollDice();
    }
}
