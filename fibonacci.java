import java.io.*;
import java.util.Scanner;
class fibonacci
{
public static void main(String args[])
{
int x1=-1,x2=1,x3,n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of terms");
n=s.nextInt();
System.out.println("The fibonacci series is:"); 
for(int i=0;i<n;i++)
{
x3=x2+x1;
System.out.println(x3);
x1=x2;
x2=x3;
}
}
}