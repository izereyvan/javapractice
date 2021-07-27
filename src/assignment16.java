import java.util.Scanner;
public class assignment16 {

	public static void main(String[] args) {
	
		int number,remainder;
		System.out.println("Enter an Interger Number");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		scan.close();
		remainder = number % 2;
		
		if( remainder == 0)
			System.out.println(number+" is an Even Number ");
		else 
			System.out.println(number+"is an Odd Number");
	}			

	}


