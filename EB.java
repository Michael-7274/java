import java.io.*;
import java.util.Scanner;
class EB
{
public static void main(String args[])
{
Double cno,type,pr,cr,use;
Double amt;
String cna;
Scanner o=new Scanner(System.in);

System.out.println("Enter customer number:");
cno=o.nextDouble();
System.out.prinln("Enter customer name:");
cna=o.next();
System.out.println("Enter previous month reading");
pr=o.nextDouble();
System.out.println("Enter current month reading");
cr=o.nextDouble();
System.out.println("For domestic press 1 or for commercial press 2");
type=o.nextDouble();
use=cr-pr;
if(type==1)
{
if(use<=100)
{
amt=use*1;
System.out.println("Amount to be paid:"+amt);
}
if(use>100&&use<=200)
{
amt=((100)*1)+((use-100)*2.50);
System.out.println("Amount to be paid:"+amt);
}
if(use>200&&use<=500)
{
amt=(100*1)+(100*2.50)+((use-200)*4);
System.out.println("Amount to be paid:"+amt);
}

if(use>500)
{
amt=(100*1)+(100*2.50)+((300)*4)+((use-500)*6);
System.out.println("Amount to be paid:"+amt);
}
}
else
{
if(use<100)
{
amt=use*2.5;
System.out.println("Amount to be paid:"+amt);
}
if(use>100&&use<=200)
{
amt=((100)*2.5)+((use-100)*5);
System.out.println("Amount to be paid:"+amt);
}

if(use>200&&use<=500)
{
amt=(100*2.5)+(100*5)+((use-200)*6.5);
System.out.println("Amount to be paid:"+amt);
}
if(use>500)
{
amt=(100*2.5)+(100*5)+((300)*6.5)+((use-500)*9);
System.out.println("Amount to be paid:"+amt);
}
}
System.out.println("units used this time:"+use);
}
}





/*
Enter customer number:
820419205034
Enter customer name:
Michael
Enter previous month reading
700
Enter current month reading
970
For domestic press 1 or for commercial press 2
1
Amount to be paid:630.0
units used this time:270.0

D:\java>java EB
Enter customer number:
820419205034
Enter customer name:
Michael
Enter previous month reading
700
Enter current month reading
970
For domestic press 1 or for commercial press 2
2
Amount to be paid:1070.0
units used this time:270.0
*/