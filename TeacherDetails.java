import java.util.*;
class Person
{
  String name;
  String gender;
  String address;
  int age;
  Person(String name, String gender, String address, int age)
  {
    this.name=name;
    this.gender=gender;
    this.address=address;
    this.age=age;
  }
}
class Employee extends Person
{
  String empId;
  String companyName;
  String qualification;
  double salary;
  Employee(String name, String gender, String address, int age, String empId, String companyName, String qualification, double salary)
  {
    super(name, gender, address, age);
    this.empId=empId;
    this.companyName=companyName;
    this.qualification=qualification;
    this.salary=salary;
  }
}
class Teacher extends Employee
{
  String subject;
  String department;
  String teacherId;
  Teacher(String name, String gender, String address, int age, String empId, String companyName, String qualification, double salary, String subject, String department, String teacherId)
  {
    super(name, gender, address, age, empId, companyName, qualification, salary);
    this.subject=subject;
    this.department=department;
    this.teacherId=teacherId;
  }
  void display()
  {
    System.out.println("\nTeacher Details:");
    System.out.println("Name: "+name);
    System.out.println("Gender: "+gender);
    System.out.println("Address: "+address);
    System.out.println("Age: "+age);
    System.out.println("Employee ID: "+empId);
    System.out.println("Company Name: "+companyName);
    System.out.println("Qualification: "+qualification);
    System.out.println("Salary: "+salary);
    System.out.println("Subject: "+subject);
    System.out.println("Department: "+department);
    System.out.println("Teacher ID: "+teacherId);
  }
}
class TeacherDetails
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no. of teachers:");
    int N=sc.nextInt();
    sc.nextLine();
    Teacher[] teachers=new Teacher[N];
    for(int i=0; i<N; i++)
    {
      System.out.println("\nEnter details of Teacher "+(i+1)+":");
      System.out.print("Name:");
      String name=sc.nextLine();
      System.out.print("Gender:");
      String gender=sc.nextLine();
      System.out.print("Address:");
      String address=sc.nextLine();
      System.out.print("Age:");
      int age=sc.nextInt();
      sc.nextLine();
      System.out.print("Employee ID:");
      String empId=sc.nextLine();
      System.out.print("Company Name:");
      String companyName=sc.nextLine();
      System.out.print("Qualification:");
      String qualification=sc.nextLine();
      
      System.out.print("Salary:");
      double salary=sc.nextDouble();
      sc.nextLine();
      System.out.print("Subject:");
      String subject=sc.nextLine();
      System.out.print("Department:");
      String department=sc.nextLine();
      System.out.print("Teacher ID:");
      String teacherId=sc.nextLine();
      teachers[i]=new Teacher(name, gender, address, age, empId, companyName, qualification, salary, subject, department, teacherId);
    }
    System.out.println("\nTeacher Information:");
    for (int i=0; i<N; i++)
    {
      teachers[i].display();
    }
  }
}

