import java.util.Scanner;
import java.util.stream.StreamSupport;

public class consoleIOlecture {

    public static void  main (String [] args){
        System.out.println("Hello, World");

        String name = "alex";
        System.out.printf("HELLO, %s", name);

        System.out.format("%d is %s's favorite number\nThis is a %b statement%n", 42, name , false);
        System.out.println("I'm on a new line?");


        System.out.println("How ya doing?");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        System.out.printf("You're feeling: %s%n",userInput);




    }

}
