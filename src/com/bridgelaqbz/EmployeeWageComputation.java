package com.bridgelaqbz;

public class EmployeeWageComputation {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;
    public static final int empRatePerHour = 20;
    public static final int numOfWorkingDays = 20;
    public static final int maxHrsInMonth = 100;

    public static void main(String[] args) {
        EmployeeWageComputation object = new EmployeeWageComputation();
        object.Uc1();
        object.Uc2();
        object.Uc3();
        object.Uc4();
        object.Uc5();
        object.Uc6();
        object.Uc7();

    }

    public void Uc1() {
        System.out.println("Welcome to the Employee Wage Computation Program. ");
        int isFullTime = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isFullTime)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }

    public void Uc2() {
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isFullTime)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * empRatePerHour;
        System.out.println("Emp Wage: " + empWage);

    }

    public void Uc3() {
        int empHrs = 0;
        int empWage = 0;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == isPartTime)
            empHrs = 4;
        else if (empCheck == isFullTime)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * empRatePerHour;
        System.out.println("Emp Wage: " + empWage);

    }

    public void Uc4() {
        int empHrs = 0;
        int empWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case isPartTime:
                empHrs = 4;
                break;
            case isFullTime:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }

        empWage = empHrs * empRatePerHour;
        System.out.println("Emp Wage: " + empWage);

    }

    public void Uc5() {
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;

        for (int day = 1; day < numOfWorkingDays; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case isPartTime:
                    empHrs = 4;
                    break;
                case isFullTime:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }

            empWage = (empHrs * empRatePerHour);
            totalEmpWage += empWage;
            System.out.println("Emp Wage: " + empWage);
        }
        System.out.println("Total emp Wage: " + totalEmpWage);

    }

    public void Uc6() {
        System.out.println("UC->");
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case isPartTime:
                    empHrs = 4;
                    break;
                case isFullTime:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day-> " + totalWorkingDays + "EmpHr: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total empWage: " + totalEmpWage);
    }
    public void Uc7(){

    int workingHr = 0;
    int totalWorkingHrs = 0;
    int monthlyTotalWage = 0;

    int[] daily_wage_array = new int[20];
        for (int i = 0; i < numOfWorkingDays && totalWorkingHrs <empRatePerHour ; i++) {
        int emp_check = (int) (Math.floor(Math.random() * 10)) % 3;
        switch (emp_check) {
            case 1:
                workingHr = 8;
                break;
            case 2:
                workingHr = 4;
                break;
            default:
                workingHr = 0;
        }
        totalWorkingHrs += workingHr;
        daily_wage_array[i] = workingHr * empRatePerHour;
    }
        for (int j = 0; j < numOfWorkingDays; j++) {
        int day = j + 1;
        System.out.println("Day " + day + " wage is " + daily_wage_array[j]);
        monthlyTotalWage = monthlyTotalWage + daily_wage_array[j];
    }
        System.out.println("\nMonthly wage is " + monthlyTotalWage);
}

}











