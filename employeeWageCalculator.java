public class employeeWageCalculator{

	public static void main(String[] args){
		int fullTime=2, partTime=1, wagePerHr=20, partTimeHr=8, fullTimeHr=16;
		int random_number=(int)(Math.random()*10%3);
		if (random_number==fullTime){
			System.out.println("Employee has worked full time so Daily wage is " + (wagePerHr*fullTimeHr));
		}else if (random_number==partTime){
			System.out.println("Employee has worked part time so Daily wage is " + (wagePerHr*partTimeHr));
		}else{
			System.out.println("Employee was absent so wage is 0");
		}

	}
