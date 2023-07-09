import java.io.*;
import java.util.Scanner;
class mt
{
public static void main(String args[])
{
int n,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
n=s.nextInt();
System.out.println("The multiplication table for "+n+" is");
for(i=1;i<=10;i++)
{
System.out.println(n+"*"+i+"="+n*i);
}
}
}