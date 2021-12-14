import java.util.Scanner;

public class lineComparison{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter x1 co-ordinate");
		int valx1 = obj.nextInt();
		System.out.println("Enter y1 co-ordinate");
		int valy1 = obj.nextInt();
		System.out.println("Enter x2 co-ordinate");
		int valx2 = obj.nextInt();
		System.out.println("Enter y2 co-ordinate");
		int valy2 = obj.nextInt();
		float lineLength1 = lineLength(valx1,valy1,valx2,valy2);

		//Second line
		System.out.println("Enter x3 co-ordinate");
		int valx3 = obj.nextInt();
		System.out.println("Enter y3 co-ordinate");
		int valy3 = obj.nextInt();
		System.out.println("Enter x4 co-ordinate");
		int valx4 = obj.nextInt();
		System.out.println("Enter y4 co-ordinate");
		int valy4 = obj.nextInt();
		float lineLength2 = lineLength(valx3,valy3,valx4,valy4);

		equality(lineLength1,lineLength2);
	}
	public static void equality(float line1, float line2){
		if (line1==line2){
			System.out.println("Both lines are equal");
		}else{
			System.out.println("Lines are not equal");
		}
}

	public static float lineLength(int x1, int y1, int x2, int y2){
		return (float) Math.sqrt( (Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)));

	}
}
