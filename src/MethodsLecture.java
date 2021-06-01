import java.util.Scanner;

public class MethodsLecture {
    public static void sayHello(String name) {
        System.out.printf("Hi there! My name is %s! Have a great day%n",name);
    }

    public static void sayHello(String salutation, String name) {
        System.out.printf("%s there! My name is %s! Have a great day%n", salutation,name);
    }


    public static int multiply (int num1, int num2){
        return num1 * num2;

    }

    public static void willYoutakeUsMtSplashmore (Scanner sc){
        System.out.println("will you take us to mt.splashmore?");
        if (!sc.nextLine().equalsIgnoreCase("yes")) {
            willYoutakeUsMtSplashmore(sc);
        }else {
            System.out.println("Thanks Dad, you're the best!");
        }
    }

//    public static void bottlesOfBlank (String beverage, int numBottles){
//        if (numBottles == 0) {
//            System.out.printf("No more bottles of %s on the wall%nNo more bottles of %s%n up now, stumble around%nAll" +
//                    " of the bottle of %s on the wall%n", beverage, beverage, beverage);
//        } else if (numBottles == 1) {
//            System.out.printf("1bottle of %s on the wall%n1 bottle of %s%nTake it down, pass it aorund%nNo more " +
//                    "bottles of %s on the wall%n", beverage, beverage, beverage);
//            bottlesOfBlank(beverage,numBottles-1);
//        }else if (numBottles== 2) {
//
//        }
//    }

    public static void main(String[] args) {
        sayHello("Alex");
        sayHello("Howdy","Alexander");
        System.out.println(multiply(5,2));
        int product = multiply(7,3);
        System.out.printf("Did you know that %d X %d", product,product,product*product);
        Scanner sc = new Scanner(System.in);
        willYoutakeUsMtSplashmore(sc);
    }

}
