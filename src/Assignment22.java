import java.util.Scanner;

public class Assignment22 {

	public static void main(String[] args) {
		int number, multiplier;
		Scanner input = new Scanner (System.in);
		
		System.out.println("enter the number");
		number = input.nextInt();
		input.close();
		
		for( multiplier =1; multiplier <= 10; multiplier++) {
			System.out.printf("%d * %d = %d\n" , number, multiplier,(number * multiplier));
		}
		

	}

}
