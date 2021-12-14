public class employeeWageCalculator{
	public static void main(String[] args){
		int present=1;
		int absent=0;
		int random_number=(int)(Math.random()*10%2);
			if (random_number==present){
				System.out.println("Employee is present");
			}else{
				System.out.println("Employee is absent");
			}

	}
}
