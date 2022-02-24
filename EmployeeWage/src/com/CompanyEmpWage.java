package com;

public class CompanyEmpWage {


    String companyName;
    int wagePerHour;
    int maxWorkingDays;
    int maxWorkingHours;
    private int totalEmpWage;

    public CompanyEmpWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours){
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.totalEmpWage = 0;
    }

    void calculateMonthlyWage(){
        EmployeeWageBuilder employee = new EmployeeWageBuilder(wagePerHour,maxWorkingDays,maxWorkingHours);
        employee.calculateMonthlyWage();
        //System.out.println("Monthly wage for the employee working in "+companyName+" is Rs. " + employee.monthlyWage + "\n");
    }

    public int getTotalEmpWage() {
        return totalEmpWage;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    //employee.calculateMonthlyWage();

//
}
