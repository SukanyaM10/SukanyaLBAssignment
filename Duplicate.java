import java.util.Scanner;
public class Duplicate{
public void getNumbers() {
	Scanner input = new Scanner(System.in);
	int[] array = new int[5];
    int count = 0; // number of uniques read
    int entered = 0; // number of entered numbers
    int num = 0;
    while (entered < array.length)
        {
        System.out.println("Enter number: ");
        num = input.nextInt();
        if ((num >= 10) && (num <= 100)) {

            boolean containsNumber = false;

            entered++;
            for (int i = 0; i < array.length; i++)

             {   if (array[i] == num)      

                 containsNumber = true;

             } 

            if (!containsNumber) {
           array[count] = num;
           count++;
            } // end if
            else
            System.out.printf("%d has already been entered\n", num);
 } // end if
 else
          System.out.println("number must be between 10 and 100");
        for (int i =0;  i< entered; i++) {
        System.out.print(array[i] + " ");
        }
                                  System.out.println();
    } // end while
    System.out.println("Your chance of entering value is over");
   } // end method getNumbers
// end class Unique
public static void main(String[]args) 
{
Duplicate objref= new Duplicate();
objref.getNumbers();
}
}