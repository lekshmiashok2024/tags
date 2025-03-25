import java.util.*;
class Employee
{
int eno;
String ename;
double esalary;
Employee(int eno, String ename, double esalary)
{
  this.eno=eno;
  this.ename=ename;
  this.esalary=esalary;
}
void display()
{
  System.out.println("Employee no.:"+eno);
  System.out.println("Employee name \n"+ename+"Employee salary"+esalary);
}
}
public class EmployeeSearch
{
  public static void main(String args[])
  { 
  int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no. of employees:");
    int n=sc.nextInt();
    Employee[] employees=new Employee[n];
      for (i=0; i<n; i++)
      {
      System.out.println("Enter details of employee:"+(i+1));
      System.out.println("Enter employee no.:");
      int eno=sc.nextInt();
      sc.nextLine();
      System.out.println("Enter employee name:");
      String ename=sc.nextLine();
      System.out.println("Enter employee salary:");
      double esalary=sc.nextDouble();
      employees[i]=new Employee(eno, ename, esalary);
  }
    System.out.println("Enter employee no. to search:");
    int searchno=sc.nextInt();
    boolean found=false;
  for (Employee emp:employees)
  {
    if (emp.eno==searchno)
    {
      System.out.println("Employee found.");
      emp.display();
      found=true;
      break;
    }
   }
    if (!found)
    {
    System.out.println("Employee not found.");
    }
  }
  }
  
  
  
  
