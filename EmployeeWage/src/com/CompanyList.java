package com;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CompanyList {

    public LinkedList<CompanyEmpWage> companyEmpWageList;
    public Map<String,CompanyEmpWage> companyToEmpWageMap;

    public CompanyList() {
        companyEmpWageList = new LinkedList<>();
        companyToEmpWageMap = new HashMap<>();
    }

    public void addCompanyEmpWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        CompanyEmpWage companyEmpWage = new  CompanyEmpWage(companyName, wagePerHour, maxWorkingDays, maxWorkingHours);
        companyEmpWage.calculateMonthlyWage();
        companyEmpWageList.add(companyEmpWage);
        companyToEmpWageMap.put(companyName, companyEmpWage);
    }


}
