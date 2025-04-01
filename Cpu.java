import java.util.*;
class Cpu
{
  int price;
  Scanner sc=new Scanner(System.in);
  Cpu()
  {
    System.out.println("Enter the price of CPU:");
    price=sc.nextInt();
  }
  class Processor
  {
    int core;
    String manufacturer;
    Scanner sc=new Scanner(System.in);
    Processor()
  {
    System.out.println("Enter the number of cores:");
    core=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the manufacturer name:");
    manufacturer=sc.nextLine();
  }
  }
  static class RAM
  {
  int memory;
  Scanner sc=new Scanner(System.in);
  RAM()
  {
  System.out.println("Enter the RAM in GB:");
  memory=sc.nextInt();
  }
}
public static void main(String args[])
{
  Cpu c=new Cpu();
  Cpu.Processor p=c.new Processor();
  Cpu.RAM r=new Cpu.RAM();
  System.out.println("\nPrice of the CPU:"+c.price +"\nNumber of cores:"+p.core +"\nName of manufacturer:"+p.manufacturer+"\nRAM in GB:"+r.memory);
}
}




