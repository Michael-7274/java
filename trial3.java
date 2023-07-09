import java.io.*;
class C 
{ 
public void disp() 
{ 
System.out.println("C"); 
} 
} 
class A extends C 
{ 
public void dispo() 
{ 
System.out.println("A"); 
} 
} 
class B extends C 
{ 
public void dispa() 
{ 
System.out.println("B"); 
} 
} 
class trial3 extends A 
{ 
public void disp() 
{ 
System.out.println("D"); 
} 
public static void main(String args[])
{ 
trial3 obj = new trial3(); 
obj.disp(); 
obj.dispo();
B objx=new B();
objx.dispa();
} 
}