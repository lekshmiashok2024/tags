import java.util.*;
class AreaCalculator
{
  double calculateArea(double radius)
  {
    return Math.PI*radius*radius;
  }
  double calculateArea(double length, double width)
  {
    return length*width;
  }
  double calculateArea(double base1, double base2, double height)
  {
    return 0.5*(base1+base2)*height;
  }
}
public class AreaMain
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    AreaCalculator ac=new AreaCalculator();
    System.out.print("Enter radius of the circle:");
    double radius=sc.nextDouble();
    System.out.println("Area of circle: "+ac.calculateArea(radius));
    
    System.out.print("Enter length of the rectangle:");
    double length=sc.nextDouble();
    System.out.print("Enter width of the rectangle:");
    double width=sc.nextDouble();
    System.out.println("Area of rectangle: "+ac.calculateArea(length, width));
    
    System.out.print("Enter base1 of the trapezoid:");
    double base1=sc.nextDouble();
    System.out.print("Enter base2 of the trapezoid:");
    double base2=sc.nextDouble();
    System.out.print("Enter height of the trapezoid:");
    double height=sc.nextDouble();
    System.out.println("Area of trapezoid: "+ac.calculateArea(base1, base2, height));
  }
}





