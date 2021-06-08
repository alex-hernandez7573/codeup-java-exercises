package grades;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;



public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student (String name) {
        this.name = name;
        this.grades= new ArrayList<>();
    }

    public String getName () {
        return name;
    }

    public void addGrade (int grade) {
        grades.add(grade);
    }

    public double getGradeAverage(){
      double total = 0;
      for (int grade : grades) {
          total += grade;
      }
      return total /grades.size();
    }

    public static void main(String[] args) {
        ArrayList<Student> studentTest = new ArrayList<>();

        studentTest.add (new Student("Alex"));
        studentTest.add (new Student("David"));
        studentTest.add (new Student("Ryan"));
        studentTest.add (new Student("Chloe"));


//        System.out.println(studentTest.get(0)+" HERE");
//        System.out.println(studentTest);
//        System.out.println(studentTest.get(3)+" HERE");

//        System.out.println(studentTest.get());
//        System.out.println();

        studentTest.get(0).addGrade(90);
        studentTest.get(0).addGrade(85);
        studentTest.get(0).addGrade(88);
        studentTest.get(0).addGrade(72);

        System.out.println("Avg: " +studentTest.get(0).getGradeAverage());

        System.out.println(studentTest);
        System.out.println();
        System.out.println(studentTest.get(2));
    }
}
