import java.util.*;
class matrix1
{
  public static void main(String args[])
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter no of rows and columns:");
  int r,c,i,j,k;
    r=sc.nextInt();
    c=sc.nextInt();
    
    int[][] mat1=new int[5][5];
    int[][] mat2=new int[5][5];
    int[][] mat3=new int[5][5];
    
    System.out.println("Enter no of elements of 1st matix:");
    for(i=0; i<r; i++)
    {
      for(j=0; j<c; j++)
      {
      mat1[i][j]=sc.nextInt();
      } 
    }
    System.out.println("Enter no of elements of 2nd matix:");
    for(i=0; i<r; i++)
    {
      for(j=0; j<c; j++)
      {
      mat2[i][j]=sc.nextInt();
      } 
    }
    System.out.println("Sum of two matrices:");
    for(i=0; i<r; i++)
    {
      for(j=0; j<c; j++)
      {
      mat3[i][j]=mat1[i][j]+mat2[i][j];
      
      System.out.print(mat3[i][j]+" ");
      }
      System.out.println( );
      }
         
 System.out.println("Product of two matrices:");
for (i = 0; i < r; i++) {
    for (j = 0; j < c; j++) {
        mat3[i][j] = 0;  
        for (k = 0; k < r; k++) {
            mat3[i][j] = mat3[i][j] + mat1[i][k] * mat2[k][j];  
        }
    }
}

for (i = 0; i < r; i++) {
    for (j = 0; j < c; j++) {
        System.out.print(mat3[i][j] + " ");
    }
    System.out.println();
}
}
} 
    
