import java.awt.*;
import java.applet.*;
import java.awt.Color;
//<applet code = "moveball.class"width="800"height="800"></applet>
public class moveball extends Applet implements Runnable
{
int x=10,y=10;
Thread t1=null;
public void init()
{
t1=new Thread(this);
}
public void start()
{
t1.start();
}
public void run()
{
try
{
for(;;)
{
repaint();
Thread.sleep(10);
}
}
catch(Exception e)
{
}
}
public void paint(Graphics g)
{
if(x>=245)
{
g.setColor(Color.blue);
x+=5;
y+=5;
}
else
{
g.setColor(Color.red);
x+=5;
y+=5;
}
g.fillOval(x,y,50,50);
}
public void stop()
{
System.out.println("x:-"+x);
System.out.println("y:-"+y);
}
}

