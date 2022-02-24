package com;


public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");
        CompanyList companyList = new CompanyList();
        companyList.addCompanyEmpWage("Company A",50,22,150);
        companyList.addCompanyEmpWage("Company B",40,26,230);
    }
}
