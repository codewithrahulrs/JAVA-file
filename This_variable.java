  class Student
{
String name;
int roll;
double per;
Student(String name,int roll,double per)
{
this.name=name;
this.roll=roll;
this.per=per;
}
void disp()
{
System.out.println("STUDENT NAME IS:"+this.name);
System.out.println("STUDENT ROLL NO IS:"+this.roll);
System.out.println("STUDENT PERCENTAGE IS:"+this.per);
}
}
class This_variable
{
public static void main(String args[])
{
Student stu=new Student("RAHUL",101,87.98);
stu.disp();
}
}