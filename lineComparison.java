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
		System.out.println("line length is " + (lineLength(valx1,valy1,valx2,valy2)));
	}

	public static float lineLength(int x1, int y1, int x2, int y2){
		return (float) Math.sqrt( (Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)));

	}
}
