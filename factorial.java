import java.io.*;
import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
int f,fact=1;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
f=s.nextInt();
for(int i=1;i<=f;i++)
{
fact=fact*i;
}
System.out.println("The factorial of the number is,"+fact);
}
}