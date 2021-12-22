package com.empwagecalculator.service.serviceprovider;

import com.empwagecalculator.service.Operations;
import com.empwagecalculator.userinputs.UserInputs;
import com.empwagecalculator.utils.InputUtility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OperationServiceProvider implements Operations {

    InputUtility inputObj = new InputUtility();
    public UserInputs UI = new UserInputs();
    public HashMap<String, List<Integer>> companies = new HashMap<>();

    public HashMap<String,Integer> details = new HashMap<>();

    @Override
    public int rand_num(int numberOfDigits, int numToAdd){
        return ((int)(Math.random() * 10 % numberOfDigits) + numToAdd);
    }

    @Override
    public int attendance(){
        return rand_num(3,0);
    }

    @Override
    public int wage( int hours_worked ){
        return (UI.getWagePerHr() * hours_worked);
    }

    @Override
    public void companyData(){

        System.out.println(" Please enter company name ");
        UI.setCompanyName(inputObj.getSCAN().nextLine());

        System.out.println(" Please enter full time hours ");
        UI.setFullTimeHr(inputObj.getSCAN().nextInt());

        System.out.println(" Please enter part time hours ");
        UI.setPartTimeHr(inputObj.getSCAN().nextInt());

        System.out.println(" Please enter the maximum number of working days in a month that an employee should not exceed ");
        UI.setMaxWorkDays(inputObj.getSCAN().nextInt());

        System.out.println(" Please enter the maximum number of working hours in a month that an employee should not exceed ");
        UI.setMaxWorkHrs(inputObj.getSCAN().nextInt());

        System.out.println(" Please enter the employee wage per hour ");
        UI.setWagePerHr(inputObj.getSCAN().nextInt());

        inputObj.getSCAN().nextLine();

    }

    @Override
    public String toStringValues() {
        return (" Company Name : " + UI.getCompanyName() +
                "\n Full time hours : " + UI.getFullTimeHr() +
                "\n Part time hours : " + UI.getPartTimeHr() +
                "\n Max Work Days per Month : " + UI.getMaxWorkDays() +
                "\n Max Work Hours per Month : " + UI.getMaxWorkHrs() +
                "\n Wage per Hour : " + UI.getWagePerHr() +
                "\n Total Days worked by employee : " + UI.getMaxDaysEmpWorked() +
                "\n Total hours worked by employee : " + UI.getMaxHrsEmpWorked()+
                "\n Total days employee worked full time : " + UI.getTotalFullTimeDays() +
                "\n Total days employee worked part time : " + UI.getTotalPartTimeDays() +
                "\n Total days employee was absent : " + UI.getTotalAbsentDays() +
                "\n Total employee wage for the month : " + UI.getEmpWage() );
    }
    @Override
    public String execution() {

        companyData();

        while ( (UI.getMaxDaysEmpWorked() < UI.getMaxWorkDays())
                &&
                (UI.getMaxHrsEmpWorked() < UI.getMaxWorkHrs()) ) {
            if ( attendance() == 0 ) {
                this.UI.setTotalAbsentDays();
            } else if ( attendance() == 1 ) {
                UI.setDailyWages(wage(UI.getPartTimeHr()));
                UI.setEmpWage(wage(UI.getPartTimeHr()));
                UI.setMaxDaysEmpWorked();
                UI.setMaxHrsEmpWorked(UI.getPartTimeHr());
                UI.setTotalPartTimeDays();
            } else {
                UI.setDailyWages(wage(UI.getPartTimeHr()));
                UI.setEmpWage(wage(UI.getFullTimeHr()));
                UI.setMaxDaysEmpWorked();
                UI.setMaxHrsEmpWorked(UI.getFullTimeHr());
                UI.setTotalFullTimeDays();
            }
        }
        details.put("FullTimeHrs", UI.getFullTimeHr());
        details.put("PartTimeHrs", UI.getPartTimeHr());
        details.put("MaxDaysPerMonth", UI.getMaxWorkDays());
        details.put("MaxWorkHrsPerMonth", UI.getMaxWorkHrs());
        details.put("WagePerHr", UI.getWagePerHr());
        details.put("TotalDaysWorked", UI.getMaxDaysEmpWorked());
        details.put("TotalFullTimeDays", UI.getTotalFullTimeDays());
        details.put("TotalPartTimeDays", UI.getTotalPartTimeDays());
        details.put("TotalAbsentDays", UI.getTotalAbsentDays());
        details.put("TotalWage", UI.getEmpWage());

        UI.setDailyWages(UI.getEmpWage());
        companies.put(UI.getCompanyName(), UI.getDailyWages());
        return toStringValues();
    }
}
