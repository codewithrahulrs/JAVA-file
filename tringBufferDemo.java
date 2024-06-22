public class tringBufferDemo 
{
public static void main(String[] args)
{
 StringBuffer sb = new StringBuffer("PQRST");
 System.out.println("Original StrinBuffer: " +sb);
 System.out.println("Original capacity: " +sb.capacity());
 sb.trimToSize();
 System.out.println("New capacity: " +sb.capacity());
 System.out.println("Runtime class: " +sb.getClass());
 System.out.println("Hashcode value: " +sb.hashCode());
 }
}
