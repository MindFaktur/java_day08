import java.util.Scanner;

public class employeeWageCalculator{
    public static void main(String[] args){
        System.out.println(" Welcome to Employee wage calculator ");
        execution();
    }

    public static void execution() {
        ValuesAndMethods obj = new ValuesAndMethods();
        obj.companyData();
        while ( (obj.maxDaysEmpWorked < obj.maxWorkDays) && (obj.maxHrsEmpWorked < obj.maxWorkHrs) ){
            if ( obj.attendance() == 0 ){
                obj.totalAbsentDays++;
            }else if ( obj.attendance() == 1 ){
                obj.empWage = (obj.empWage + obj.wage(obj.partTimeHr));
                obj.maxDaysEmpWorked++;
                obj.maxHrsEmpWorked += obj.partTimeHr;
                obj.totalPartTimeDays++;
            }else{
                obj.empWage = (obj.empWage + obj.wage(obj.fullTimeHr));
                obj.maxDaysEmpWorked++;
                obj.maxHrsEmpWorked += obj.fullTimeHr;
                obj.totalFullTimeDays++;
            }
        }
        System.out.println(" The company name is " + obj.companyName);
        System.out.println(" The total number of days worked by employee is " + obj.maxDaysEmpWorked + " days");
        System.out.println(" The total number of days absent is " + obj.totalAbsentDays + " days");
        System.out.println(" The total number of days worked as part time is " + obj.totalPartTimeDays + " days");
        System.out.println(" The total number of days worked as full time is " + obj.totalFullTimeDays + " days");
        System.out.println(" The total wage for the month is " + obj.empWage);
    }


}

class ValuesAndMethods{
    public int partTimeHr, fullTimeHr, maxDaysEmpWorked, maxWorkDays, empWage,
            maxHrsEmpWorked, maxWorkHrs, totalPartTimeDays, totalFullTimeDays, totalAbsentDays, wagePerHr;
    public String companyName;

    public void companyData() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Please enter company name ");
        companyName = scan.nextLine();
        System.out.println(" Please enter full time hours ");
        fullTimeHr = scan.nextInt();
        System.out.println(" Please enter part time hours ");
        partTimeHr = scan.nextInt();
        System.out.println(" Please enter the maximum number of working days in a month that an employee should not exceed ");
        maxWorkDays = scan.nextInt();
        System.out.println(" Please enter the maximum number of working hours in a month that an employee should not exceed ");
        maxWorkHrs = scan.nextInt();
        System.out.println(" Please enter the employee wage per hour ");
        wagePerHr = scan.nextInt();
    }

    public static int rand_num(int numberOfDigits, int numToAdd) {
        return ((int)(Math.random() * 10 % numberOfDigits) + numToAdd);
    }

    public int attendance() {
        return rand_num(3,0);
    }

    public int wage( int hours_worked ){
        return (wagePerHr * hours_worked);
    }
}

//added ability to store total wage