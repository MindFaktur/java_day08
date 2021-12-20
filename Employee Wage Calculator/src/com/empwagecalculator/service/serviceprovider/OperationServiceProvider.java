package com.empwagecalculator.service.serviceprovider;

import com.empwagecalculator.service.Operations;
import com.empwagecalculator.userinputs.UserInputs;
import com.empwagecalculator.utils.InputUtility;

import java.util.ArrayList;
import java.util.List;

public class OperationServiceProvider implements Operations {

    InputUtility inputObj = new InputUtility();
    UserInputs userObj = new UserInputs();

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
        return (userObj.getWagePerHr() * hours_worked);
    }

    @Override
    public void companyData(){

        System.out.println(" Please enter company name ");
        userObj.setCompanyName(inputObj.getSCAN().nextLine());

        System.out.println(" Please enter full time hours ");
        userObj.setFullTimeHr(inputObj.getSCAN().nextInt());

        System.out.println(" Please enter part time hours ");
        userObj.setPartTimeHr(inputObj.getSCAN().nextInt());

        System.out.println(" Please enter the maximum number of working days in a month that an employee should not exceed ");
        userObj.setMaxWorkDays(inputObj.getSCAN().nextInt());

        System.out.println(" Please enter the maximum number of working hours in a month that an employee should not exceed ");
        userObj.setMaxWorkHrs(inputObj.getSCAN().nextInt());

        System.out.println(" Please enter the employee wage per hour ");
        userObj.setWagePerHr(inputObj.getSCAN().nextInt());

    }

    @Override
    public String toStringValues() {
        return (" Company Name : " +userObj.getCompanyName() +
                "\n Full time hours : " + userObj.getFullTimeHr() +
                "\n Part time hours : " + userObj.getPartTimeHr() +
                "\n Max Work Days per Month : " + userObj.getMaxWorkDays() +
                "\n Max Work Hours per Month : " + userObj.getMaxWorkHrs() +
                "\n Wage per Hour : " + userObj.getWagePerHr() +
                "\n Total Days worked by employee : " + userObj.getMaxDaysEmpWorked() +
                "\n Total hours worked by employee : " + userObj.getMaxHrsEmpWorked()+
                "\n Total days employee worked full time : " + userObj.getTotalFullTimeDays() +
                "\n Total days employee worked part time : " + userObj.getTotalPartTimeDays() +
                "\n Total days employee was absent : " + userObj.getTotalAbsentDays() +
                "\n Total employee wage for the month : " + userObj.getEmpWage() );
    }

    public String execution() {

        companyData();

        while ( (userObj.getMaxDaysEmpWorked() < userObj.getMaxWorkDays())
                &&
                (userObj.getMaxHrsEmpWorked() < userObj.getMaxWorkHrs()) ) {
            if ( attendance() == 0 ) {
                userObj.setTotalAbsentDays();
            } else if ( attendance() == 1 ) {
                userObj.setEmpWage(wage(userObj.getPartTimeHr()));
                userObj.setMaxDaysEmpWorked();
                userObj.setMaxHrsEmpWorked(userObj.getPartTimeHr());
                userObj.setTotalPartTimeDays();
            } else {
                userObj.setEmpWage(wage(userObj.getFullTimeHr()));
                userObj.setMaxDaysEmpWorked();
                userObj.setMaxHrsEmpWorked(userObj.getFullTimeHr());
                userObj.setTotalFullTimeDays();
            }
        }
        return toStringValues();
    }

}
