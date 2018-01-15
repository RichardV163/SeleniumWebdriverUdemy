package staticPackage;

public class StaticExampleClass {
    private String make;
    private static int instanceNunm = 0;

    public StaticExampleClass(String make){
        this.make = make;
        instanceNunm++;
    }
    public String getMake(){
        return make;
    }

    public static int getInstanceNunm() {
        return instanceNunm;
    }
}
