import java.io.*;
class A
{ 
public void methodA()
{ 
System.out.println("method of Class A"); 
} 
} 
class B extends A 
{ 
public void methodA() 
{ 
System.out.println("method of Class B"); 
} 
} 
class C extends A 
{ 
public void methodA() 
{ 
System.out.println("method of Class C"); 
} 
} 
class D extends A 
{ 
public void methodA() 
{
System.out.println("method of Class D"); 
} 
} 
class trial2 
{ 
public static void main(String args[]) 
{
A obj0 = new A(); 
B obj1 = new B(); 
C obj2 = new C(); 
D obj3 = new D(); //All classes can access the method of class A 
obj0.methodA(); 
obj1.methodA();
obj2.methodA(); 
obj3.methodA(); 
} 
}