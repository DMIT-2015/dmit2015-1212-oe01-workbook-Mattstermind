package ca.nait.dmit.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMITest {

    @Test
    void bmiShouldBeUnderWeight() {
        BMI bmi1 = new BMI();
        bmi1.setWeight(200);
        bmi1.setHeight(66);
        assertEquals(32.3,bmi1.bmi(), 0.05);
        assertEquals("obese", bmi1.bmiCategory());
    }

    @Test
    void bmiCategory() {
    }
}