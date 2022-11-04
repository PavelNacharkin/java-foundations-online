package ru.itsjava.statics;

public class StaticPractice {
    public static void main(String[] args) {
//        System.out.println("Salary.increaseCoeficent = " + Salary.increaseCoeficent);
        Salary cleanerSalary = new Salary(5_000.0);
        Salary targetSalary = new Salary(10_000.0);
        System.out.println("cleanerSalary.getFullSalary() = " + cleanerSalary.getFullSalary());
        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());

        Salary.setIncreaseCoefficient(1.0);
        System.out.println("cleanerSalary.getFullSalary() = " + cleanerSalary.getFullSalary());
        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());

    }
}
