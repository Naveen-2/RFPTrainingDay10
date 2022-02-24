package com;

public class CompanyEmpWage {

    String companyName;
    int wagePerHour;
    int maxWorkingDays;
    int maxWorkingHours;

    public CompanyEmpWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours){
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    void calculateMonthlyWage(){
        EmployeeWageBuilder employee = new EmployeeWageBuilder(wagePerHour,maxWorkingDays,maxWorkingHours);
        employee.calculateMonthlyWage();
        System.out.println("Monthly wage for the employee working in "+companyName+" is Rs. " + employee.monthlyWage + "\n");

    }


    //employee.calculateMonthlyWage();

//
}
