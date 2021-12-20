package com.empwagecalculator.userinputs;

public class UserInputs {

    private int partTimeHr, fullTimeHr, maxDaysEmpWorked, maxWorkDays, empWage,
            maxHrsEmpWorked, maxWorkHrs, totalPartTimeDays, totalFullTimeDays, totalAbsentDays, wagePerHr;
    private String companyName;

    private final String[] empList = new String[5];

    public int getPartTimeHr() {
        return partTimeHr;
    }

    public void setPartTimeHr(int partTimeHr) {
        this.partTimeHr = partTimeHr;
    }

    public int getFullTimeHr() {
        return fullTimeHr;
    }

    public void setFullTimeHr(int fullTimeHr) {
        this.fullTimeHr = fullTimeHr;
    }

    public int getMaxDaysEmpWorked() {
        return maxDaysEmpWorked;
    }

    public void setMaxDaysEmpWorked() {
        maxDaysEmpWorked++;
    }

    public int getMaxWorkDays() {
        return maxWorkDays;
    }

    public void setMaxWorkDays(int maxWorkDays) {
        this.maxWorkDays = maxWorkDays;
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

    public void setMaxWorkHrs(int maxWorkHrs) {
        this.maxWorkHrs += maxWorkHrs;
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

    public void setWagePerHr(int wagePerHr) {
        this.wagePerHr = wagePerHr;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmpList(int index, String stringValue) {
        empList[index] = stringValue;
    }

    public String getEmpList(int index) {
        return empList[index];
    }

    public int getEmpListLength() {
        return empList.length;
    }

}
