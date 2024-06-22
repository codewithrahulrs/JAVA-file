import java.util.*;
enum Day
{
SUNDAY,
MONDAY,
TUESDAY,
WEDNESDAY,
THURSDAY,
FRIDAY,
SATURDAY;
}
public class Test
{
Day day;
public Test(Day day)
{
this.day=day;
}
public void daylsLike()
{
switch(day)
{
case MONDAY:
System.out.println("Mondays are bad");
break;
case FRIDAY:
System.out.println("Friday are better");
break;
case SATURDAY:
System.out.println("Weekend day better");
break;
default:
System.out.println("Midweek days are so-so");
break;
}
}
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a day");
String str = sc.nextLine();
str = str.toUpperCase();
Test t1 = new Test(Day.valueOf(str));
t1.daylsLike();
}
}



