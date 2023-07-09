import java.io.*;
import java.util.Scanner;
class ex
{
public static void main(String args[])
{
int a,b=0;//b=0,produces exception during runtime
int c;
Scanner s=new Scanner(System.in);
System.out.println("Enter A value");
a=s.nextInt();
c=a/b;
}
}