
public class Factorial {

	public static void main(String[] args) {
		
	 long factnum;
		System.out.println("Factorial");
			for( int i=1; i<=20; i++)
		{
			factnum = 1;
		for (int j=1; j<=i; j++)
			{
			factnum *=j;
			}
		System.out.println( factnum );
	}
}
}
