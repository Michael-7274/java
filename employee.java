import java.io.*;
import java.util.Scanner;
class person
{
String name,address;
double phone;
int age;
void getdata()
{
Scanner i =new Scanner(System.in);
System.out.println("enter your name");
name=i.next();
System.out.println("enter your age");
age=i.nextInt();
System.out.println("enter your phone number");
phone=i.nextDouble();
System.out.println("enter your address");
address=i.next();
}
void display1()
{
System.out.println("employee name:"+ name);
}
}

class employee extends person
{
int basicpay,pf,hra,gross,net;

void getpayinfo()
{
Scanner j=new Scanner(System.in);
System.out.println("enter basic pay");
basicpay=j.nextInt();
System.out.println("enter pf");
pf=j.nextInt();
System.out.println("enter hra");
hra=j.nextInt();
}
void display ()
{
System.out.println("gross salary="+gross);
System.out.println("net salary="+net);
}
public static void main (String args[])
{
employee obj=new employee();
obj.getdata();
obj.getpayinfo ();
obj.gross=obj.basicpay+obj.pf+obj.hra;
obj.net=obj.gross-obj.pf;
obj.display1();
obj.
display();
}
}
