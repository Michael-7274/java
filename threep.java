import java.io.*;
import java.util.Scanner;
class three<T,U,V>
{
T a;
U b;
V c;
three(T n1,U n2,V n3)
{
a=n1;
b=n2;
c=n3;
}
void print()
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}
class threep
{
public static void main(String args[])
{
Integer a;
Float b;
String c;
Scanner s=new Scanner(System.in);
System.out.println("Enter an integer");
a=s.nextInt();
System.out.println("Enter a float value"); 
b=s.nextFloat();
System.out.println("Enter a string");
c=s.next();
three<Integer,Float,String>o1=new three<>(a,b,c);
o1.print();
}
}
