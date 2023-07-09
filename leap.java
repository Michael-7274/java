import java.io.*;
import java.util.Scanner;
class leap
{
public static void main(String args[])
{
int y;
Scanner s=new Scanner(System.in);
System.out.println("Enter the year");
y=s.nextInt();
if(y%400==0)
System.out.println(y+",is a leap year");
else if(y%100==0)
System.out.println(y+",is not a leap year");
else if(y%4==0)
System.out.println(y+",is a leap year");
else
System.out.println(y+",is not a leap year");
}
}