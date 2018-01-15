package oopsconcepts;

public class Car {

    private String color;
    private String make;
    private String model;
    private int year;

    int speed;
    int gear;

    public Car() {
        this.speed = 0;
        this.gear = 0;
        System.out.println("Execute without argument");
    }

    public void increaseSpeed(){
        System.out.println("Increasing speed");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
