package com;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");
        CompanyEmpWage company1 = new CompanyEmpWage("Company A",50,22,150);
        company1.calculateMonthlyWage();
        CompanyEmpWage company2 = new CompanyEmpWage("Company B",40,26,230);
        company2.calculateMonthlyWage();
    }
}
