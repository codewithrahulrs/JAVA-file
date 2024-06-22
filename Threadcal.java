import java.util.*;
class ThreadA extends Thread
{
int a,b;
public void run()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two no");
a=sc.nextInt();
b=sc.nextInt();
add();
multi();
sub();
div();
}
void add()
{
int c=a+b;
System.out.println("Addition is"+c);
}
void multi()
{
int c=a*b;
System.out.println("Multi is"+c);
}
void sub()
{
int c=a-b;
System.out.println("Sub is"+c);
}
void div()
{
int c=a/b;
System.out.println("div is"+c);
}
}
class Threadcal
{
public static void main(String args[])
{
ThreadA t1=new ThreadA();
t1.start();
}
}
