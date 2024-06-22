import java.applet.Applet;
import java.awt.Graphics;
/*<applet code ="SimpleApplet1.class"width ="300"height="300">
</applet>
*/
public class SimpleApplet1 extends Applet
{
public void init()
{
System.out.println("Applet initialized");
}
public void start()
{
System.out.println("Applet started");
}
public void stop()
{
System.out.println("Applet stopped");
}
public void destroy()
{
System.out.println("Applet destroyed");
}
public void paint(Graphics g)
{
g.drawLine(40,40,100,100);
g.drawString("Hello,Applet!",50,50);
}
}



