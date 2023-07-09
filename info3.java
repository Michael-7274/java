import java.io.*;
class info
{
int i;
String name;
info() //default constructor
{
 i=10;
name="Joseph";
}
info(int j,String n)// parameterized 
{                            //constructor
i=j;
name=n;
}
info(info e)//Copy constructor
{
i=e.i;
name=e.name;
}
void display()
{
System.out.println(i);
System.out.println(name);
}
}
class info3
{
public static void main (String args[])
{
info o=new info();
o.display();
info o1=new info(10,"john");

o1.display();
info o2=new info(o);
o2.display();
}
}