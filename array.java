import java.util.*;
class array
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter no. of elements in the array:");
  int n=sc.nextInt();
  sc.nextLine();
  String[] strArray=new String[n];
  System.out.println("Enter "+n+" strings");
  for (int i=0; i<n; i++)
  {
    System.out.println("Enter string "+(i+1)+" :");
    strArray[i]=sc.nextLine();
  }
  while (true)
  {
    System.out.println("\nMenu");
    System.out.println("1. Search a string in the array \n2. Sort the array \n3. Exit \nEnter your choice:");
    int choice=sc.nextInt();
    sc.nextLine();
    switch (choice)
    {
      case 1:
      System.out.println("Enter the string to search:");
      String search=sc.nextLine();
      searchString(strArray, search);
      break;
      case 2:
      sortArray(strArray);
      System.out.println("Array sorted successfully");
      System.out.println("Sorted Array:"+Arrays.toString(strArray));
      break;
      case 3:
      System.out.println("Exiting the program.");
      return;
      default:
      System.out.println("Invalid choice.");
    }
  }
}
public static void searchString(String[] array, String search)
{
  boolean found=false;
  for (String str:array)
  {
    if (str.equalsIgnoreCase(search))
    {
      found=true;
      break;
    }
  }
  if (found)
  {
    System.out.println("String "+search+" is found in the array.");
  }
  else
  {
  System.out.println("String " +search+" is not found in the array.");
  }
}
public static void sortArray(String[] array)
{
  Arrays.sort(array);
}
}


