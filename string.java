import java.util.*;
class string
{
  public static  void main(String args[])
  {
  String string1;
  String string2;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the 1st string:");
  string1=sc.nextLine();
  System.out.println("Enter the 2nd string:");
  string2=sc.nextLine();
  System.out.println("Length of 1st string"+" "+string1.length());
  System.out.println("Length of 2nd string"+" "+string2.length());
  System.out.println("Comparing two strings:"+" "+string1.compareTo(string2));
  System.out.println("Comparing two strings:"+" "+string1.equals(string2));
  System.out.println("concatenating two strings:"+" "+string1.concat(string2));
  }
}
