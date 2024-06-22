package Plant.pack;
import java.util.*;
public class Average
{
public double d,a,b,c;
public void avg()
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THREE NUMBER");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
d=(a+b+c)/3;
System.out.println("AVERAGE= "+d);
}
}