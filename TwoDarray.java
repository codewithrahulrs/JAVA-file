import java.util.*;
class TwoDarray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 9 number\n");
int a[][]=new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.print("Array Element\n");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
}