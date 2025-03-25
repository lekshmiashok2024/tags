import java.util.*;
class products
{
  int pcode; 
  String pname;
  float price;
  void getdata()
{
  System.out.println("Enter pcode, pname, price");
  Scanner sc = new Scanner(System.in);
  this.pcode=sc.nextInt();
  sc.nextLine();
  this.pname=sc.nextLine();
  this.price=sc.nextFloat();
}

void display()
{
  System.out.println("Product code is "+pcode +"product name is "+pname +"price is "+price);
}
}
class product
{
  public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  products p1 = new products();
  p1.getdata();
  products p2 = new products();
  p2.getdata();
  products p3 = new products();
  p3.getdata();

  p1.display();
  p2.display();
  p3.display();

  if(p1.price < p2.price && p1.price < p3.price)
{
    System.out.println("Product 1 is the lowest.");
}
  else if(p2.price < p3.price)
{
    System.out.println("Product 2 is lowest.");
}
  else
{
    System.out.println("Product 3 is lowest.");
}
} 
}


