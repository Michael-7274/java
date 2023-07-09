import java.util.*;
class Employee
{
int empid;
String empname;
String address;
String mailid;
String mobileno;
double BP,Grosssalary,Netsalary;
double DA,HRA,PF,Fund;
void getdata()
{
System.out.println("Enter employee id,name,address,mailid,mobile no");
Scanner sc=new Scanner(System.in);
empid=sc.nextInt();
empname=sc.next();
address=sc.next();
mailid=sc.next();
mobileno=sc.next();
}

void display()
{
System.out.println("empid:" +empid);
System.out.println("empname:" +empname);
System.out.println("address:" +address);
System.out.println("mailid:" +mailid);
System.out.println("Mobile Number:" +mobileno);
System.out.println("Gross pay:" +Grosssalary);
System.out.println("Net pay:" +Netsalary);
}
}
class Programmer extends Employee
{
void computePay()
{
System.out.print("Enter Basic Pay");
Scanner input=new Scanner(System.in);
BP=input.nextDouble();

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
void computePay()
{
System.out.print("Enter Basic Pay");
Scanner input=new Scanner(System.in);
BP=input.nextDouble();

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
void computePay()
{
System.out.print("Enter Basic Pay:");
Scanner input=new Scanner(System.in);
BP=input.nextDouble();
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
void computePay()
{
System.out.print("Enter Basic Pay:");
Scanner input=new Scanner(System.in);
BP=input.nextDouble();
Grosssalary=BP;
DA=(BP*97/100);
HRA=(BP*10/100);
PF=(BP*12/100);
Fund=(BP*0.1/100);
Grosssalary=BP+DA+HRA;
Netsalary=Grosssalary-(PF+Fund);
}
}

public class PaySlip2
{
public static void main(String args[])
{
System.out.println("\tPAy SLIP");
int choice;
Scanner i=new Scanner(System.in);
do
{
System.out.println("Menu");
System.out.println("1.Programmer");
System.out.println("2.Asst_Professor");
System.out.println("3.Associate_Professor");
System.out.println("4.Professor");
System.out.println("5.Exit");
System.out.println("Enter your choice");
choice=i.nextInt();
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
