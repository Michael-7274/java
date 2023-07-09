import java.io.*;
import java.util.Scanner;
class swap
{
public static void main(String args[])
{
int i,j,t;
Scanner s=new Scanner(System.in);
System.out.println("Enter the values to be swapped");
i=s.nextInt();
j=s.nextInt();
System.out.println("Before swapping");
System.out.println("i="+i);
System.out.println("j="+j);
t=i;
i=j;
j=t;
System.out.println("After swapping");
System.out.println("i="+i);
System.out.println("j="+j);
}
}