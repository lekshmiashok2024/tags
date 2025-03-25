import java.util.*;
class greatest
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter three numbers");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b && a>c)
System.out.println("The greatest number is "+a);
else if(b>c)
System.out.println("The greatest number is "+b);
else
System.out.println("The greatest number is "+c);
}
}
