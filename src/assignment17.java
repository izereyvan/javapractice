import java.util.Scanner;
public class assignment17 {

	public static void main(String[] args) {
		//inits
          Scanner sc = new Scanner(System.in);
          int year;
        //prompt the user for year
          System.out.println("Enter a year: ");
          year = sc. nextInt();
          sc.close();
          //check whether year is leap year
          if ( year % 4 ==0 && year % 100!=0) {
        	  System.out.println(year + "Is a leap year");
          }else if (year % 400 == 0) {
        	  System.out.println(year + "is a leap year");
          }else {
        	  System.out.println(year + "IS NOT a leap year");
          }
          }

	}


