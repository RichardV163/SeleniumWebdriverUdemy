package staticPackage;

public class StaticDemo {
    public static void main (String [] args) {
        StaticExampleClass s1 = new StaticExampleClass("bmw");
        System.out.println("Make of car is: "+ s1.getMake());
        System.out.println("Get instance: "+ StaticExampleClass.getInstanceNunm());

        StaticExampleClass s2 = new StaticExampleClass("bmw");
        System.out.println("Make of car is: "+ s1.getMake());
        System.out.println("Get instance: "+ StaticExampleClass.getInstanceNunm());
    }
}
