
public class Car extends Vehicle{
	 int noofleaf;
	    Car(String r,int m,int n)
	    {
	        super(r,m);
	        noofleaf=n;
	    }
	    void display()
	    {
	        System.out.println("Four wheeler car");
	        super.display();
	        System.out.println("No. of Wheels:" +noofleaf);
	    }

}
