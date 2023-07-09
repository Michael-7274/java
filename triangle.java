import java.io.*;
import java.util.Scanner;
abstract class shape
{
abstract double area();
void display(String st)
{
System.out.println("shape type is:"+st);
}
}
class circle extends shape
{
int r;
void getdata ()
{
Scanner c= new Scanner(System.in);
r=c.nextInt();
}
double area()
{

return 3.14*r*r;
}
}

class rectangle extends shape
{
int l,b;
void getdata()
{
Scanner lb=new Scanner (System.in);
l=lb.nextInt();
b=lb.nextInt();
}
double area()
{
return l*b;
}
}
class triangle extends shape
{
int b,h;
void getdata()  
{
Scanner bh= new Scanner (System.in);
b=bh.nextInt();
h=bh.nextInt();
}
double area()
{
return 0.5*b*h;
}
public static void main(String args[])
{
circle s=new circle();
s.display("circle");
System.out.println("Enter the radius");
s.getdata();
System.out.println(s.area());

rectangle r=new rectangle();
r.display("rectangle");
System.out.println("Enter length and breadth");
r.getdata();
System.out.println(r.area());

triangle t=new triangle();
t.display("triangle");
System.out.println("Enter  breadth and height");
t.getdata();
System.out.println(t.area());
}
}
