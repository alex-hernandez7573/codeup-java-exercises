import java.util.Arrays;

public class ArraysExercises {

public static Person[] addPeople (Person[] people, Person addPeople){
return null;

}




    // TODO: 6/3/21 Create an array that holds 3 Person objects.
    //  Assign a new instance of the Person class to each element.
    public static void main(String[] args) {

        Person[] people = new Person[3];

        people [0] = new Person("Alex");
        people [1] = new Person("Chloe");
        people [2] = new Person("Irene");

// TODO: Iterate through the array and print out the name of each person in the array.
        for (Person HUMAN_NAME : people) {
            System.out.println(HUMAN_NAME.getName());
        }

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        // a ref unreadable code is printed to console [I@5acf9800

    }

}
