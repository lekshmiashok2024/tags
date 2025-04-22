import graphics.*;
class area
{
  public static void main(String args[])
  {
    rectangle rt=new rectangle();
    triangle tr=new triangle();
    square sq=new square();
    circle cr=new circle();
    rt.area();
    rt.display();
    tr.area();
    tr.display();
    sq.area();
    sq.display();
    cr.area();
    cr.display();
  }
}


package graphics;
import java.util.*;
public class square
{
  int a,s;
  Scanner sc=new Scanner(System.in);
  public void area()
  {
   System.out.println("Enter the side:");
   s=sc.nextInt();
   a=s*s;
  }
   public void display()
  {
   System.out.println("The area of square:"+a);
  }
}


package graphics;
import java.util.*;
public class circle
{
  int r;
  double a;
  Scanner sc=new Scanner(System.in);
  public void area()
  {
   System.out.println("Enter the radius:");
   r=sc.nextInt();
   a=3.14*r*r;
  }
  public void display()
  {
   System.out.println("The area of circle:"+a);
  }
}


package graphics;
import java.util.*;
public class rectangle
{
  int l,b,a;
  Scanner sc=new Scanner(System.in);
  public void area()
  {
   System.out.println("Enter the length:");
   l=sc.nextInt();
   System.out.println("Enter the breadth:");
   b=sc.nextInt();
   a=l*b;
  }
  public void display()
  {
   System.out.println("The area of rectangle:"+a);
  }
}


package graphics;
import java.util.*;
public class triangle
{
  int l,b;
  double a;
  Scanner sc=new Scanner(System.in);
  public void area()
  {
   System.out.println("Enter the length:");
   l=sc.nextInt();
   System.out.println("Enter the breadth:");
   b=sc.nextInt();
   a=0.5*l*b;
  }
  public void display()
  {
   System.out.println("The area of triangle:"+a);
  }
}
