import java.util.Scanner;
public class StudentAverage {
	Scanner sc =new Scanner(System.in);

	public void qualityPoints() {
		System.out.println("Enter the Student Average:");
		int avg=sc.nextInt();
		if(avg>=90 && avg<=100) {
			System.out.println("Grade for this avergae is 4");
		}
		else if (avg>=80 && avg<=89) {
				System.out.println("Grade for this avergae is 3");
		}
		else if(avg>=70 && avg<=79) {
					 System.out.println("Grade for this avergae is 2");
		}
		else if(avg>=60 && avg<=69) {
				    System.out.println("Grade for this avergae is 1");
		}
				   else {
					   System.out.println("Grade for this average is 0");
			}
		}

		public static void main(String[] args) {
		StudentAverage obj =new StudentAverage();
		obj.qualityPoints();
		
}

}

