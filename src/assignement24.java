import java.util.Scanner;

public class assignement24 {

	public static void main(String[] args) {
		int number;
		long factorial = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		number = input.nextInt();
		input.close();
		if (number < 0);
		System.out.println("Can't find the factorial of negative number");
	
		else if (number <= 1 )
			System.out.printf("%d! = %d" ,number,factorial);
		else {
			for(int counter = number; counter>= 2; counter--) {
			}
			System.out.printf("%d! = %d" , number, factorial);
			}
		}
		
			

	}

}
