package tconv;
import java.util.Scanner;
public class_timer
{
double h,s,min;
Scanner sc=new Scanner(System.in);
public void stohmin()
{
System.out.println("Enter the number of seconds");
s=sc.nextDouble();
min=s/60;
System.out.println("minutes:"+min);
h=s/3600;
System.out.println("Hours:"+h);
}
public void htomins
{
System.out.println("Enter the numbe of hours");
h=sc.nextdouble();
min=h*60;
s=h*3600;
System.out.println("minutes="+min+",Seconds="+s);
}
public void mintohs
{
System.out.println("Enter the number of minutes");
min=sc.nextDouble();
h=min/60;
s=min*60;
System.out.println("Hours="+h+",Seconds="+s);
}
}