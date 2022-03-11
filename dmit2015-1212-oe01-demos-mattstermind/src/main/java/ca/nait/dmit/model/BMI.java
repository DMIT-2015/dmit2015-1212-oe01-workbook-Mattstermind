package ca.nait.dmit.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BMI {

    private double weight;
    private double height;

    //methods
    public double bmi(){
        return 703 * weight / Math.pow(height, 2);
    }
    public String bmiCategory(){
        String weightChoice;
        return weightChoice = bmi() < 18.5 ? "underweight" : bmi() >= 18.5 && bmi() <=24.9 ? "normal": bmi() >= 25 && bmi() <=29.9 ? "overweight" : "obese";
    }
}
