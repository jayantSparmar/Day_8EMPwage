package com.bridgelaqbz;

public class EmployeeWageComputation {
    public static void main(String[] args) {
    EmployeeWageComputation object = new EmployeeWageComputation();
    object.Uc1();
}

    public void Uc1(){
        System.out.println("Welcome to the Employee Wage Computation Program. ");
        int isFullTime = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isFullTime)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}






