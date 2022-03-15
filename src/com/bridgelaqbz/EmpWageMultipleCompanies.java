package com.bridgelaqbz;

public class EmpWageMultipleCompanies {

    //Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    //Method to Calculate Employee Wage by Hours and Type
    public static void calculateEmpWage(String company, int wagePerHr, int numWorkingDays, int maxHrPerMonth) {

        // Local Variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        //Compute Emp Wage for Month
        while (totalEmpHrs <= maxHrPerMonth && totalWorkingDays < numWorkingDays) {
            totalWorkingDays++;     //Incrementing Working Days
            double empCheck = Math.floor(Math.random() * 10) % 3;

            switch ((int) empCheck) {
                case IS_PART_TIME:
                    System.out.println("Employee is Present as PART TIME");
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is Present as FULL TIME");
                    empHrs = 8;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day No :" + totalWorkingDays + " Emp Hrs: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * wagePerHr;
        System.out.println("Total Employee Wage for Company : " + company + " is : " + totalEmpWage);
    }

    public static void main(String[] args) {
        //Welcome Message for Initial Purpose
        System.out.println("Welcome to Employee Wages Problem Developed by Shubham Pawar");
        calculateEmpWage("Jio", 20, 10, 15);
        calculateEmpWage("Vodafone", 30, 8, 20);
        calculateEmpWage("", 30, 8, 20);
    }
}