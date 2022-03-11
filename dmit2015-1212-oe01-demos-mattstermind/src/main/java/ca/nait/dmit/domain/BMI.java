package ca.nait.dmit.domain;

public class BMI {

    private double weight;
    private double height;

    //getters & setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //constructors
    public BMI() {
        weight = 100;
        height = 60;
    }

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    //methods
    public double bmi(){
        return 0;
    }
    public String bmiCategory(){
        return "";
    }

}
