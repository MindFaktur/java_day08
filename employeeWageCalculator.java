import java.util.Scanner;

public class employeeWageCalculator{
    public static void main(String[] args){
        System.out.println(" Welcome to Employee wage calculator ");
        execution();
    }

    public static void execution() {
        ValuesAndMethods obj = new ValuesAndMethods();
        Scanner newScan = new Scanner(System.in);
        System.out.println("Press \n1) Add company 2)quit ");
        int option = newScan.nextInt();
        int count = 0;
        while ( option != 2 ){
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
            obj.empList[count] = obj.toStringValues();
            count++;
            System.out.println("Press \n1) Add company 2)quit ");
            option = newScan.nextInt();
        }
        for ( int i = 0; i < 5; i++ ){
            System.out.println(obj.empList[i]);
        }

    }


}

class ValuesAndMethods{
    public int partTimeHr, fullTimeHr, maxDaysEmpWorked, maxWorkDays, empWage,
            maxHrsEmpWorked, maxWorkHrs, totalPartTimeDays, totalFullTimeDays, totalAbsentDays, wagePerHr;
    public String companyName;
    public String[] empList = new String[5];

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

    public String toStringValues() {
       return (" Company Name : " +companyName +
               "\n Full time hours : " + fullTimeHr +
               "\n Part time hours : " + partTimeHr +
               "\n Max Work Days per Month : " + maxWorkDays +
               "\n Max Work Hours per Month : " + maxWorkHrs +
               "\n Wage per Hour : " + wagePerHr +
               "\n Total Days worked by employee : " + maxDaysEmpWorked +
               "\n Total hours worked by employee : " + maxHrsEmpWorked +
               "\n Total days employee worked full time : " + totalFullTimeDays +
               "\n Total days employee worked part time : " + totalPartTimeDays +
               "\n Total days employee was absent : " + totalAbsentDays +
               "\n Total employee wage for the month : " + empWage );
    }

}

//added ability to store total wage