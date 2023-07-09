import java.util.*;
import java.lang.Thread;
class even extends Thread
{
int x;
even(int a)
{
x=a;
}
public void run()
{
System.out.println("square"+(x*x));
}
}

class odd extends Thread
{
int x;
odd(int a)
{
x=a;
}
public void run()
{
System.out.println("cube"+(x*x*x));
}
}

class numbergenerator extends Thread
{
int num;
Random r=new Random();
public void run()
{

try
{
for(int i=0;i<=10;i++)
{
num=r.nextInt(100);
System.out.println("number generated is "+num);
if(num%2==0)
{
even t1=new even(num);
t1.start();
}
else
{
odd t2=new odd(num);
t2.start();
}
 sleep(1000);
}
}
catch(InterruptedException e)
{
}

}
}

class multithread
{
public static void main(String args[])
{
numbergenerator t=new numbergenerator();
t.start();
}
}
