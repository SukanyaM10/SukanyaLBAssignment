import java.util.Scanner;
public class Temperature
{
	Scanner input = new Scanner( System.in );
	// return Celsius equivalent of Fahrenheit temperature
	   public void celsius()
	   {
		  
		  System.out.println("Enter  Celsius temperature");
          double celsius =input.nextDouble(); 
          double fahrenheit=((9*celsius)/5)+32;
          System.out.println("Fahrenheit temperature is = "+fahrenheit);
		  
	   } 

	   // return Fahrenheit equivalent of Celsius temperature
	   public void fahrenheit()
	   {
		  System.out.print("Input a degree in Fahrenheit: ");
	        double fahrenheit = input.nextDouble();
	        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
	        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
		
		}   

	   public static void main(String[] args)
	   {
		  Temperature temp = new Temperature();
		   temp.celsius();
		   temp.fahrenheit();
	   }
}

	   
	
