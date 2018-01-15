package staticPackage;

public class StaticKeyNotesDemo {

    // static method cannot use the non-static variable or method directly
    // This and super cannot be used in static context

    public static int addNum = 10;

    public static void main(String[] args) {
        int output = sum(10);
        System.out.println("Printing out: ");
    }
    public static int sum (int num){
        return num + addNum;
    }
}
