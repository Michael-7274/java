import java.io.*;
abstract class shape
{
abstract double area();
void display(String st)
{
System.out.println("shape type is"+st);
}
}
class circle extends shape
{
int r=10;
double area()
{
return 3.14*r*r;
}
}

class rectangle extends shape
{
int l=10,b=20;
double area()
{
return l*b;
}
}
class triangle1 extends shape
{
int b=20,h=10;
double area()
{
return 0.5*b*h;
}
public static void main(String args[])
{
circle c=new circle();
c.display("circle");
System.out.println(c.area());

rectangle r=new rectangle();
r.display("rectangle");
System.out.println(r.area());

triangle1 t=new triangle1();
t.display("triangle");
System.out.println(t.area());
}
}
