import java.io.*;
class rect
{
int l,b; 
rect(int n1,int n2) 
{ 
l=n1; 
b=n2; 
}
void rambo()
{
System.out.println("Rocky");
} 
} 
class cubic extends rect 
{ 
int h; 
cubic(int n1,int n2,int n3) 
{ 
super(n1,n2); 
h=n3;
} 
} 
class EC4 
{ 
public static void main(String args[]) 
{ 
cubic obj=new cubic(20,40,5);
obj.rambo(); 
System.out.println("Area of rectangle="+(obj.l*obj.b)); 
System.out.println("Area of cubic rectangle="+(obj.l*obj.b*obj.h)); 
} 
}