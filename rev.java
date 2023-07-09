import java.io.*;
import java.util.Scanner;
class rev
{
public static void main(String args[])
{
int n,rev=0,rem;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number to be reversed");
n=s.nextInt();
while(n>0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
System.out.println("The reversed number is:"+rev);
}
}