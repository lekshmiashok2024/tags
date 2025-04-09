 import java.util.*;
interface Shape {
double area();
 double perimeter();
 }
class Circle implements Shape {
private double radius;
public Circle(double radius) {
 this.radius = radius;
 }
 public double area() {
 return Math.PI * radius * radius;
 }
 public double perimeter() {
 return 2 * Math.PI * radius;
}
 }
 class Rectangle implements Shape {
 private double length;
 private double width;
 public Rectangle(double length, double width) {
 this.length = length;
 this.width = width;
 }
 public double area() {
 return length * width;
 }
 public double perimeter() {
 return 2 * (length + width);
 }
 }
 public class ShapeCalculator {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 int choice = 0;
 while (choice != 3) {
 System.out.println("\n----- Shape Calculator -----");
  System.out.println("1. Calculate for Circle");
  System.out.println("2. Calculate for Rectangle");
 System.out.println("3. Exit");
 System.out.print("Enter your choice (1-3): ");
 choice = sc.nextInt();
 switch (choice) {
 case 1:
 System.out.print("Enter radius of circle: ");
 double radius = sc.nextDouble();
 Circle circle = new Circle(radius);
  System.out.println("Area of circle: "+circle.area());
 System.out.println("Perimeter of circle: "+circle.perimeter());
  break;
 case 2:
 System.out.print("Enter length of rectangle: ");
 double length = sc.nextDouble();
 System.out.print("Enter width of rectangle: ");
 double width = sc.nextDouble();
 Rectangle rectangle = new Rectangle(length, width);
 System.out.println("Area of rectangle: "+rectangle.area());
 System.out.println("Perimeter of rectangle: "+rectangle.perimeter());
  break;
   case 3:
 System.out.println("Exiting program.");
break;
  default:
 System.out.println("Invalid choice.");
}
}
}
    }
