public class ThreadPriority1 extends Thread
{
ThreadPriority1(String st)
{
super(st);
}
public void run()
{
System.out.println("Runing thread name is:"+Thread.currentThread().getName());
System.out.println("Runing thread priority is:"+Thread.currentThread().getPriority());
}
public static void main(String args[])
{
ThreadPriority1 m1=new ThreadPriority1("First Thread");
ThreadPriority1 m2=new ThreadPriority1("Second Thread");
m1.setPriority(Thread.MIN_PRIORITY);
m2.setPriority(Thread.MAX_PRIORITY);
m1.start();
m2.start();
}
}
