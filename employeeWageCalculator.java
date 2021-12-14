public class employeeWageCalculator{
	public static void main(String[] args){
		final int fullTime = 2, partTime = 1, wagePerHr = 20, partTimeHr = 8,
						fullTimeHr = 16, workDaysPerMonth = 20, maxHr = 100 ;
		int totalHr = 0;
		int totalFullTimeDays = 0;
		int totalPartTimeDays = 0;
		int totalAbsent = 0;
		while ( totalHr < maxHr && (totalFullTimeDays + totalPartTimeDays) < workDaysPerMonth ){
			int random_number=(int)(Math.random() * 10 % 3);
			switch (random_number){
				case fullTime:
						totalHr += fullTimeHr;
						totalFullTimeDays += 1;
						break;
				case partTime:
						totalPartTimeDays += 1;
						totalHr += partTimeHr;
						break;
				default:
						totalAbsent += 1;
			}
		}
		System.out.println("total days worked as full time is " + totalFullTimeDays);
		System.out.println("total days worked as part time is " + totalPartTimeDays);
		System.out.println("total days absent is " + totalAbsent);
		System.out.println("total employee hours worked for the month is " + totalHr);
		System.out.println("total wage for the month " + (totalHr * wagePerHr));

	}
}
