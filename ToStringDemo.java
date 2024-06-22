public class ToStringDemo
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("PQRSTUVWXYZ");
System.out.println("Original StringBuffer: " + sb);
String s = sb.substring(2);
String s2 = s.toString();
System.out.println("String representation of StringBuffer: " +s2);
}
}