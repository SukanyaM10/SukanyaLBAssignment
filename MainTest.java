public class MainTest {

    public static void main(String[] args) {

        Rectangle re = new Rectangle();

        System.out.println("Area and perimeter of default rectangle ");

        displayRectData(re);

        re = new Rectangle(12, 10);

        System.out.println("Area and perimeter of  new rectangle");

        displayRectData(re);

    }

    public static void displayRectData(Rectangle r) {

        System.out.println("Current Dimensions:\n "+ r);

        System.out.printf("Area of Rectangle: %.2f\nPerimeter of Rectangle: %.2f\n\n",

        r.computeArea(), r.computePerimeter());

    }

}
