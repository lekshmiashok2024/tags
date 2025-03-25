import java.util.*;
class factorial
{
public static void main(String args[])
{
int fact=1,a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
a=sc.nextInt();
for(int i=1; i<=a; i++)
{
fact*=i;
}
System.out.println("Factorial is "+fact);
}
}

