import java.util.*;
class UTsum
{
public static void main(String args[])
{
int i,j,sum=0;
int a[][]=new int[3][3];
Scanner sc=new Scanner (System.in);
System.out.println("Enter a no");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(i<j)
sum+=a[i][j];
}
}
System.out.println("Sum of uper triangle="+sum);
System.out.println();
}
}


