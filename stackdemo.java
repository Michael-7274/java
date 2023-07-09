import java.io.*;
import java.util.Scanner;
interface stackADT
{
public void push(int i);
public void pop();
}
class stackarray implements stackADT
{
int stack[]=new int[10];
int top=-1;
public void push(int item)
{
if(top==9)
System.out.println("overflow");
else
{
top++;
stack[top]=item;
System.out.println(item+",is pushed");
}
}
public void pop()
{
if(top<0)
System.out.println("underflow");
else
{
System.out.println(stack[top]+",is popped");
top--;
}
}
public void display()
{
for(int i=0;i<=top;i++)
System.out.println("element:"+stack[i]);
}
}

class stackdemo
{
public static void main(String args[])throws IOException
{
int ch;
Scanner in=new Scanner(System.in);
stackarray s=new stackarray();
do
{
System.out.println("Array Stack");
System.out.println("1.Push \n2.Pop \n3.Display \n4.exit");
System.out.println("Enter your choice");
ch=in.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter the value to push");
int i=in.nextInt();
s.push(i);
break;
case 2:
s.pop();
break;
case 3:
System.out.println("The elements are:");
s.display();
break;
}
}while(ch!=4);
}
}