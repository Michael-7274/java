import java.io.*;
import java.io.BufferedReader;
class Employee
{
String empid;
String empname;
String address;
String mailid;
String mobileno;
double BP,Grosssalary,Netsalary;
double DA,HRA,PF,Fund;
void getdata() throws IOException 
{
BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
System.out.println("\n Enter employee id");
empid=sc.readLine();
System.out.println("\n Enter employee name");
empname=sc.readLine();
System.out.println("\n Enter employee address");
address=sc.readLine();
System.out.println("\n Enter employee mailid");
mailid=sc.readLine();
System.out.println("\n Enter employee mobile no");
mobileno=sc.readLine();
}

void display()
{
System.out.println("\n empid:" +empid);
System.out.println("\n empname:" +empname);
System.out.println("\n address:" +address);
System.out.println("\n mailid:" +mailid);
System.out.println("\n Mobile Number:" +mobileno);
System.out.println("\n Gross pay:" +Grosssalary);
System.out.println("\n Net pay:" +Netsalary);
}
}
class Programmer extends Employee
{
void computePay() throws IOException
{
System.out.print("\n Enter Basic Pay");
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
BP=Double.parseDouble(input.readLine());

DA=(BP*97/100);
HRA=(BP*10/100);
PF=(BP*12/100);
Fund=(BP*0.1/100);
Grosssalary=BP+DA+HRA;
Netsalary=Grosssalary-(PF+Fund);
}
}

class Asst_Professor extends Employee
{
void computePay() throws IOException
{
System.out.print("\n Enter Basic Pay");
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
BP=Double.parseDouble(input.readLine());

DA=(BP*97/100);
HRA=(BP*10/100);
PF=(BP*12/100);
Fund=(BP*0.1/100);
Grosssalary=BP+DA+HRA;
Netsalary=Grosssalary-(PF+Fund);
}
}
class Associate_Professor extends Employee
{
void computePay() throws IOException
{
System.out.print("\n Enter Basic Pay:");
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
BP=Double.parseDouble(input.readLine());
Grosssalary=BP;
DA=(BP*97/100);
HRA=(BP*10/100);
PF=(BP*12/100);
Fund=(BP*0.1/100);
Grosssalary=BP+DA+HRA;
Netsalary=Grosssalary-(PF+Fund);
}
 }

class Professor extends Employee
{
void computePay() throws IOException
{
System.out.print("\n Enter Basic Pay:");
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
BP=Double.parseDouble(input.readLine());
Grosssalary=BP;
DA=(BP*97/100);
HRA=(BP*10/100);
PF=(BP*12/100);
Fund=(BP*0.1/100);
Grosssalary=BP+DA+HRA;
Netsalary=Grosssalary-(PF+Fund);
}
}

public class payslip
{
public static void main(String args[]) throws IOException
{
System.out.println("\n\tPay Slip");
int choice;
BufferedReader i=new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("\n Menu");
System.out.println("\n 1.Programmer");
System.out.println("\n 2.Asst_Professor");
System.out.println("\n 3.Associate_Professor");
System.out.println("\n 4.Professor");
System.out.println("\n 5.Exit");
System.out.println("\n Enter your choice");
choice=Integer.parseInt(i.readLine());
switch(choice)
{
case 1:
Programmer p=new Programmer();
p.getdata();
System.out.println("------------programmer------------");
p.computePay();
p.display();
break;

case 2:
Asst_Professor as=new Asst_Professor();
as.getdata();
System.out.println("------------Asst_Professor ------------");
as.computePay();
as.display();
break;

case 3:
Associate_Professor ap=new Associate_Professor();
ap.getdata();
System.out.println("------------Associate_Professor ------------");
ap.computePay();
ap.display();
break;

case 4:
Professor pr=new Professor();
pr.getdata();
System.out.println("------------Professor ------------");
pr.computePay();
pr.display();
break;
}
}while(choice!=5);
}
}
