package ConsoleRPG;

import java.util.Scanner;
//import java.lang;

public class MainGame {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to play the RPG?");
        String input = scan.nextLine();

        if (input.equals("yes")) {
            System.out.println("GAME START");
        } else {
            System.out.println("GAME END");
            System.exit(0);
        }

    }
}
