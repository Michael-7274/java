import java.io.*;
import java.util.Scanner;
class prime
{
public static void main(String args[])
{
int a,flag=0;
Scanner p=new Scanner(System.in);
System.out.println("Enter a number greater than 2");
a=p.nextInt();
for(int i=2;i<=(a/2);i++)
{
if(a%i==0)
flag=1;
}
if(flag==1)
System.out.println(a+",is not a prime number");
else
System.out.println(a+",is a prime number");
}
}