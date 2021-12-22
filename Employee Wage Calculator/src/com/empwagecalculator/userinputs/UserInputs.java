package com.empwagecalculator.userinputs;

import java.util.ArrayList;
import java.util.List;

public class UserInputs {

    private static int partTimeHr, fullTimeHr, maxDaysEmpWorked, maxWorkDays, empWage,
            maxHrsEmpWorked, maxWorkHrs, totalPartTimeDays, totalFullTimeDays, totalAbsentDays, wagePerHr;
    private static String companyName;

    private final ArrayList<Integer> dailyWages = new ArrayList<>();

    public List<Integer> getDailyWages() {
        return dailyWages;
    }

    public void setDailyWages (Integer val) {
        dailyWages.add(val);
    }

    public int getPartTimeHr() {
        return partTimeHr;
    }

    public void setPartTimeHr(int parthr) {
        partTimeHr = parthr;
    }

    public int getFullTimeHr() {
        return fullTimeHr;
    }

    public void setFullTimeHr(int fullHr) { fullTimeHr = fullHr; }

    public int getMaxDaysEmpWorked() {
        return maxDaysEmpWorked;
    }

    public void setMaxDaysEmpWorked() {
        maxDaysEmpWorked++;
    }

    public int getMaxWorkDays() {
        return maxWorkDays;
    }

    public void setMaxWorkDays(int maxDays) { maxWorkDays = maxDays ;
    }

    public int getEmpWage() {
        return empWage;
    }

    public void setEmpWage(int emp_Wage) {
        empWage += emp_Wage;
    }

    public int getMaxHrsEmpWorked() {
        return maxHrsEmpWorked;
    }

    public void setMaxHrsEmpWorked(int max_Hrs_Emp_Worked) {
        maxHrsEmpWorked += max_Hrs_Emp_Worked;
    }

    public int getMaxWorkHrs() {
        return maxWorkHrs;
    }

    public void setMaxWorkHrs(int maxHrs) {
        maxWorkHrs = maxHrs;
    }

    public int getTotalPartTimeDays() {
        return totalPartTimeDays;
    }

    public void setTotalPartTimeDays() {
        totalPartTimeDays++;
    }

    public int getTotalFullTimeDays() {
        return totalFullTimeDays;
    }

    public void setTotalFullTimeDays() {
        totalFullTimeDays++;
    }

    public int getTotalAbsentDays() {
        return totalAbsentDays;
    }

    public void setTotalAbsentDays() {
        totalAbsentDays++;
    }

    public int getWagePerHr() {
        return wagePerHr;
    }

    public void setWagePerHr(int wageHr) {
        wagePerHr = wageHr;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String company_Name) {
        companyName = company_Name;
    }

}
