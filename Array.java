public class Array {

    public static void main(String [] args){
        // a) Set the 10 elements of integer array counts to zero.
        int [] zeroArray = new int[10];
        for (int i = 10; i == 0; i--) {
            System.out.println("Count to zero from 10 elements" + zeroArray);
        }

        // b) Add one to each of the 15 elements of integer array bonus.

        int [] arrayBonus = new int[15];
        for (int i = 0; i <arrayBonus.length; i++) {
            System.out.println("Bonus array values "+ arrayBonus[i]);
        }


        //c) Display the five values of integer array bestScores in column format.
        int [] bestScores = {100,95,85,45,65};
        System.out.printf("%n%s%12s %n", "Value", "BestScores");
        for (int counter = 0; counter < bestScores.length ; counter++) {

            System.out.printf( "%d%9d%n" , counter , bestScores[counter]);
        }
    }
}