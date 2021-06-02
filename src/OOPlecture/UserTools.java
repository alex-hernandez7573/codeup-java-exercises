package OOPlecture;

import java.util.Scanner;

public class UserTools {
    public static Scanner scanner = new Scanner (System.in);

    public static void login (User u) {
        System.out.println("PLEASE ENTER YOUR PASSWORD");

        String userPassword = scanner.nextLine();

        if (userPassword.equals(u.passWord)){
            System.out.println("YOU'VE SUCCESSFULLY LOGGED IN!");
        } else {

            System.out.println("PASSWORD IS INCORRECT!");
        }
    }

    public static void main(String[] args) {

//        User testUser = new User()

    }
}
