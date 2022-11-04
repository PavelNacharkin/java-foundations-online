package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Salary {
    private double baseSalary;
    private static double increaseCoefficient = 2.5;


    public double getFullSalary() {
        return baseSalary * increaseCoefficient;

    }
    public static void setIncreaseCoefficient(double increaseCoefficent1){
        increaseCoefficient=increaseCoefficent1;
    }



}
