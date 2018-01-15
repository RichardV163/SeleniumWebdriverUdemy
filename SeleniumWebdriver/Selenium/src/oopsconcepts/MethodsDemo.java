package oopsconcepts;

public class MethodsDemo {

    public static void findGrades(String name, int score){
        String grade = null;
        if (score > 90) {
            grade = "A";
        }
        System.out.println("Grade is " + grade);
    }

    public static void main(String [] args) {
        findGrades("John", 91);
    }



}
