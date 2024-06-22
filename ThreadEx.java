class ThreadA extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("Therad of ThreadA class running "+i);
}
System.out.println("Normal flow of ThreadA class running");
}
}
class ThreadB extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("Therad of ThreadB class running "+i);
}
System.out.println("Normal flow of ThreadB class running");
}
}
class ThreadEx
{
public static void main(String args[])
{
ThreadA t1=new ThreadA();
ThreadB t2=new ThreadB();
t1.start();
t2.start();
}
}




