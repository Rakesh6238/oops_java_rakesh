import java.util.Scanner;
public class symmetric{  
public static void main(String args[]){      
int i,j,r,c,count=1;
Scanner s=new Scanner(System.in);
System.out.print("Enter number of rows and columns of the matrix :");
r=s.nextInt();
c=s.nextInt();
int mat1[][]=new int[10][10];
int mat2[][]=new int[10][10];
System.out.print("Enter the elements of matrix :");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
mat1[i][j]=s.nextInt();
}
}
System.out.print("The entered matrix is: \n");
for(i=0;i<r;i++)
{    
for(j=0;j<c;j++)
{    
System.out.print(mat1[i][j]+" ");  
}
System.out.println("");
}

for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
mat2[j][i]=mat1[i][j];
}
}
System.out.print("The Transpose of the  matrix is :\n");
for(i=0;i<r;i++)
{    
for(j=0;j<c;j++)
{    
System.out.print(mat2[i][j]+" ");  
}
System.out.println("");
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(mat1[i][j] != mat2[i][j])
{
count++;
break;
}
}
}
if(count==1)
{
System.out.print("\n The matrix you entered is SYMMETRIC ");
}
else
{
System.out.print("\n The matrix you entered is not SYMMETRIC ");
}
}
}
