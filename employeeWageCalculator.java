public class employeeWageCalculator{

	public static void main(String[] args){
		int present=1, absent=0, wagePerHr=20, totalHr=8;
		int random_number=(int)(Math.random()*10%2);
		if (random_number==present){
			System.out.println("Employee Daily wage is " + (wagePerHr*totalHr));
		}else{
			System.out.println("Employee was absent so wage is 0");
		}

	}
}
