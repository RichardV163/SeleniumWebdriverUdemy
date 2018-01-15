package oopsconcepts;

public class ClassDemo {
    public static void main (String [] arg){
        Car bmw = new Car();
        bmw.setColor("red");
        bmw.setMake("bmw");
        bmw.setModel("2017");
        bmw.setYear(2017);

        Car c1 = new Car();

        System.out.println(bmw.getYear());
        System.out.println(c1.gear);
    }
}
