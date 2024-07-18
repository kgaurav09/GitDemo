import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		
		int x, y,t;
		
		Scanner sc= new Scanner(System.in);
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("Before swapping number");
		
		t=x;
		x=y;
		y=t;
		
		System.out.println("After swapping:"+x+" "+y);
	}

}
