import java.io.*;
import java.util.Scanner;
class sum
{
public static void main(String args[])
{
int n,i,s=0;
Scanner a=new Scanner(System.in);
System.out.println("Enter the natural number to be added upto");
n=a.nextInt();
for(i=1;i<=n;i++)
{
s=s+i;
}
System.out.println("The sum is,"+s);
}
}