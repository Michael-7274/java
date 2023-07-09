import java.io.*;
import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
String str,rstr="";
int i,k;
System.out.println("Enter the string");
Scanner s=new Scanner(System.in);
str=s.next();
k=str.length();
for(i=k-1;i>=0;i--)
{
rstr=rstr+str.charAt(i);
}
if(str.equals(rstr))
System.out.println(str+",is PALINDROME");
else
System.out.println(str+",is not PALINDROME");
}
}