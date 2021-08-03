import java.util.Scanner;

public class assignement19 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 sides of triangle");
		int a=s.nextInt();
		int b=s. nextInt();
		int c=s.nextInt();
		if(a+b > c && b+c>a && c+a>b);
		System.out.println("Triangle is possible")
	else if (a == b && b == c)
		System.out.println("Equilateral Triangle")
		else if(a == b|| b==c c==a)
		System.out.println("Isoceles Triangle")
		else
			System.out.println("Scalene Triangle");	
		else
			System.out.println("Triangle is not possible");
		
	}
		
	}

}
