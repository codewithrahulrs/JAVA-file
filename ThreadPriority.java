public class ThreadPriority extends Thread
{
public void run()
{
System.out.println("Runing thread name is:"+Thread.currentThread().getName());
System.out.println("Runing thread priority is:"+Thread.currentThread().getPriority());
}
public static void main(String args[])
{
ThreadPriority m1=new ThreadPriority();
ThreadPriority m2=new ThreadPriority();
//m1.setPriority(Thread.MIN_PRIORITY);
//m2.setPriority(Thread.MIN_PRIORITY);
m1.start();
m2.start();
}
}
