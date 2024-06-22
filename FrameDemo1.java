import java.awt.*;
public class FrameDemo1
{
public static void main(String args[])
{
Frame f=new Frame("Demo Frame");
Label ib = new Label("Hello World");
f.add(ib);
f.setVisible(true);
f.setSize(300,300);
}
}
