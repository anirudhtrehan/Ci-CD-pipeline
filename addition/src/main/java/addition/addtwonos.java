package addition;
import java.util.Scanner;
public class addtwonos {
	public static void main(String[] args) {
		int a,b;
		System.out.println("ADDITION OF TWO NOS:");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number:");
		a=scan.nextInt();
		System.out.println("Enter Second number:");
		b=scan.nextInt();
		System.out.println("The sum of two number is: "+(a+b));
	}

}
