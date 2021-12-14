public class employeeWageCalculator{
    public static void main(String[] args){
        System.out.println(" Welcome to Employee wage calculator ");
        ValuesAndMethods obj = new ValuesAndMethods();
        while ( (obj.maxDaysEmpWorked < obj.maxWorkDays) && (obj.maxHrsEmpWorked < obj.maxWorkHrs) ){
            if ( obj.attendance() == obj.isAbsent ){
                obj.totalAbsentDays++;
            }else if ( obj.attendance() == obj.isPartTime ){
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
        System.out.println(" The total number of days worked by employee is " + obj.maxDaysEmpWorked + " days");
        System.out.println(" The total number of days absent is " + obj.totalAbsentDays + " days");
        System.out.println(" The total number of days worked as part time is " + obj.totalPartTimeDays + " days");
        System.out.println(" The total number of days worked as full time is " + obj.totalFullTimeDays + " days");
        System.out.println(" The total wage for the month is " + obj.empWage);
    }


}

class ValuesAndMethods{
    int partTimeHr = 4, fullTimeHr = 8, maxDaysEmpWorked = 0, maxWorkDays = 20, empWage = 0,
            maxHrsEmpWorked = 0, maxWorkHrs = 100, isPresent = 2, isPartTime = 1, isAbsent = 0,
            totalPartTimeDays = 0, totalFullTimeDays = 0, totalAbsentDays = 0;
    static int wagePerHr = 20;
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
