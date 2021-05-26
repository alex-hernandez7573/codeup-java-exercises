import java.util.Scanner;

public class ConsoleExercises {

    public static void  main (String [] args){

        double pi = 3.14159;
        System.out.println("The value of pi is approximately: "+pi);
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a Integer");
        int userInputInt = scanner.nextInt();
        System.out.println("The int entered was: "+userInputInt);

        System.out.println("Enter three words!");
        Scanner words = new Scanner (System.in);
        String stringUserInput = words.nextLine();
        System.out.println(stringUserInput+" <-- you typed this");

        System.out.println("Enter a sentence?");



        System.out.println("Enter the length and the width of of the code up classroom");
        Scanner num = new Scanner(System.in);
        System.out.println("length: ");
        double length = num.nextDouble();
        System.out.println("Width: ");
        double width = num.nextDouble();
        System.out.println(length*width+" The area is");
        System.out.println(length+length+width+width+" The perimeter");

    }

}
