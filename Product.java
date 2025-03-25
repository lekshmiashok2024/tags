import java.util.Scanner;
public class Product
{
int pcode;
String pname;
float price;

void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter pcode, pname, price:");
this.pcode=sc.nextInt();
sc.nextLine();
this.pname=sc.nextLine();
this.price=sc.nextFloat();
}

void display()
{
System.out.println("Product code "+pcode + ", Product name "+pname + ", Price "+price);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Product p1=new Product();
Product p2=new Product();
Product p3=new Product();
System.out.println("Enter details for Product1:");
p1.getdata();
System.out.println("Enter details for Product2:");
p2.getdata();
System.out.println("Enter details for Product3:");
p3.getdata();
System.out.println("\nProduct Details:");
p1.display();
p2.display();
p3.display();
Product cheapest;
if (p1.price<=p2.price && p1.price<=p3.price) 
{
cheapest=p1;
}
else if (p2.price<=p1.price && p2.price<= p3.price)
{
cheapest=p2;
}
{
cheapest=p3;
}
System.out.println("\nProduct with the lowest price:");
cheapest.display();
sc.close();
}
}





