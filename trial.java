import java.io.*;
class trial
{
static int x=99;
static void cd()
{
x=34;
System.out.println("x="+x);
}
public static void main(String args[])
{
cd();
int a,b,c,d,e;
a=10;
b=a++;
System.out.println("a="+a+"b="+(b+5));
c=7;
d=++c;
System.out.println("c="+c+"d="+d);
System.out.println("X="+x);
}
}