import java.util.Scanner;

	public class SalaryCalc

	{ 
	public static void main( String[] args )
	{ 
		Scanner input = new Scanner( System.in );

		SalaryCalc employee1 = new SalaryCalc();
		SalaryCalc employee2 = new SalaryCalc();
		//SalaryCalc employee3 = new SalaryCalc();

	// Employee #1
		
	System.out.print( "Enter the first Employee name: " );
	String name1 = input.nextLine();
	employee1.setEmployeeName( name1 );

	System.out.print( "Enter the no of hours worked for this employee: ");
	int hours1 = input.nextInt();

	System.out.print( "Enter the hourly rate for this employee: ");
	double rate1 = input.nextDouble();

	employee1.calculatePay( hours1, rate1 );
	employee1.displayEmployee();

	// Employee #2
	System.out.print( "\n\nEnter the employee #2 name: " );
	String name2 = input.nextLine();
	employee2.setEmployeeName( name2 );

	System.out.print( "\n Enter the # of hours worked for this employee: ");
	int hours2 = input.nextInt();

	System.out.println( "\n Enter the hourly rate for this employee: ");
	double rate2 = input.nextDouble();

	employee2.calculatePay( hours2, rate2 );
	employee2.displayEmployee();

	}

	private void displayEmployee() {
		// TODO Auto-generated method stub
		
	}

	private void calculatePay(int hours1, double rate1) {
		// TODO Auto-generated method stub
		
	}

	private void setEmployeeName(String name1) {
		// TODO Auto-generated method stub
		
	}
	}
