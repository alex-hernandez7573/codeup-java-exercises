package grades;

import java.util.HashMap;
import java.util.Map;
import Util.Input;

public class GradesApplication {



    public static void main(String[] args) {
        HashMap <String, Student> students = new HashMap<>();

        Student alexander = new Student("Alexander");
        Student tucker = new Student("Tucker");
        Student brad = new Student("Brad");
        Student susan = new Student("Susan");

        alexander.addGrade(88);
        alexander.addGrade(72);
        alexander.addGrade(100);

        susan.addGrade(80);
        susan.addGrade(90);
        susan.addGrade(72);

        tucker.addGrade(66);
        tucker.addGrade(100);
        tucker.addGrade(92);

        brad.addGrade(78);
        brad.addGrade(100);
        brad.addGrade(100);

        students.put("CaffeinatedCode",alexander);
        students.put("KiwiCode",susan);
        students.put("Batman",tucker);
        students.put("WhoMeWhat",brad);

        System.out.println("GH Name Test");
        System.out.println(susan.getName());
        System.out.println(susan.getGradeAverage());
//        System.out.println(susan.ge());
        for(String github : students.keySet()){
            System.out.println(github+ " :: user");
//            System.out.println();
            System.out.println(" ---");
        }


    }

}
