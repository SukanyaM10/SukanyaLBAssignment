public class Employee {

	private String firstname;
	private String lastname;
	private double monthlySalary;
	
	public Employee(String firstname,String lastname,double monthlySalary) {
		this.firstname= firstname;
		this.lastname= lastname;
		this.monthlySalary = monthlySalary;
			}
	
		public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}


	public void setMonthlySalary(double monthlySalary) {
	if(monthlySalary>0) {
		this.monthlySalary = monthlySalary;
	}
}

public static void main(String[]args) {
			//TODOAuto-generated method stub
	
			Employee employee1=new Employee("Sukanya","Mohan",45000);
			Employee employee2=new Employee("Sukanya","Vignesh", 55000);
			
			// Initial detailed Salary statement of Employee
			System.out.println("\n"+employee1.getFirstname() +" "+employee1.getLastname() +" Yearly Salary :"+ (12 *employee1.getMonthlySalary()));
			System.out.println("\n"+employee2.getFirstname() +" "+employee2.getLastname() +" Yearly Salary :"+ (12 *employee2.getMonthlySalary()));
			
			// Salary hike for 10% yearly
			double incrementedSalary1=employee1.getMonthlySalary() +employee1.getMonthlySalary() * 0.1;
			employee1.setMonthlySalary(incrementedSalary1);
			double incrementedSalary2=employee2.getMonthlySalary()+employee2.getMonthlySalary() * 0.1;
			employee2.setMonthlySalary(incrementedSalary2);
			
			// After 10% rise as hike for yearly-- this is the Monthly salary of two employees
			System.out.println("\n"+employee1.getFirstname() +" "+employee1.getLastname() +" Yearly Salary :"+ (12 *employee1.getMonthlySalary()));
			System.out.println("\n"+employee2.getFirstname() +" "+employee2.getLastname() +" Yearly Salary :"+ (12 *employee2.getMonthlySalary()));
			}
}