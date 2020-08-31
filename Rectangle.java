import java.text.DecimalFormat;

public class Rectangle {

    private double rlength;

    private double rwidth;

    public Rectangle() {

        this(1.0, 1.0);// Defaults to 1.0 length and width

    }

    public Rectangle(double rlength, double rwidth) {

        this.rlength = verifyLenWidValue(rlength);

        this.rwidth = verifyLenWidValue(rwidth);

    }

    // Creating get and set methods for both Length and Width
    public double getLength() {

        return rlength;

    }

    public double getWidth() {

        return rwidth;

    }

    public void setLength(double rlength) {

        this.rlength = verifyLenWidValue(rlength);

    }

    public void setWidth(double rwidth) {

        this.rwidth = verifyLenWidValue(rwidth);

    }

    //Perimeter of rectangle 2(L+b)
    public double computePerimeter() {

        return (rlength * 2) + (rwidth * 2);

    }

    //Area of Rectangle Lxb
    public double computeArea() {

        return rlength * rwidth;

    }

    public String toString() {

        DecimalFormat dfmt = new DecimalFormat("#,##0.00");

 

        return "Length: " + dfmt.format(rlength) + "\nWidth: " +

                dfmt.format(rwidth);

    }

    //verify that length and width are each floating-point numbers larger than 0.0 and less than 20.0. 
    private double verifyLenWidValue(double value) {

        if (value < 0) {

            throw new IllegalArgumentException("Argument is negative.");

        }

        else if (value > 20) {

            throw new IllegalArgumentException("Argument is greater than 20.");

        }

        else return value;

    }

}

