import java.io.*;
class Invoice
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String partnumber;
    String part_description;
    int Quantity;
    double price;
    double amount;

    Invoice()
    {
        partnumber="1";
        part_description="hdd";
        Quantity=0;
        price=1000;
 }

    public String get_partnumber()throws IOException
    {
        System.out.println("Enter part number");
        partnumber=br.readLine();
        return partnumber;
    }
     public String get_part_description()throws IOException
    {
        System.out.println("Enter part description ");
        part_description=br.readLine();
        return part_description;
    }
    public int get_Quantity()throws IOException
    {
        System.out.println("Enter number of items ");
        Quantity=Integer.parseInt(br.readLine());
        return Quantity;
    }
     public double get_price()throws IOException
    {
        System.out.println("Enter price of items");
        price=Double.parseDouble(br.readLine());
        return price;
    }
    public String set_partnumber(String number)
    {
        partnumber=number;
        return partnumber;
    }
     public String set_part_description(String description)
    {
        part_description=description;
        return part_description;
    }
    public int set_Quantity(int numitem)
    {
        Quantity=numitem;
        return Quantity;
    }
     public double set_price(double pricefinal )
    {
        price=pricefinal;
        return price;
    }
    public double Invoice_amount()
    {
        amount = price*Quantity;
        //System.out.printf("\n Amount \n"+amount);
        amount = (amount>0)?amount:0;
        return amount;
    }
    public void displayInfo()
        {
            System.out.printf("part number\t"+partnumber+"\tpart description\t"+part_description+"\tQuantity\t"+Quantity+"\tprice\t"+price);
            System.out.printf("\n Amount \t"+amount);
            System.out.println();
        }
    public static void main(String [] args)throws IOException
    {
     
       Invoice inv1 = new Invoice();

        inv1.get_partnumber();
        inv1.get_part_description();
        inv1.get_Quantity();
        inv1.get_price();
        inv1.Invoice_amount();
        inv1.displayInfo();

    }
}
