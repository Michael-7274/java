package distpack;
import java.util.Scanner;
public class dist
{
double km,m,mil;
Scanner o=new Scanner(System.in);
public void kmtomilm()
{
System.out.println("Enter the no.of kilometer");
km=o.nextDouble();
m=km*1000;
mil=km/1.6;
System.out.println("Meters="+m+"Miles="+mil);
}
public void miltokmm()
{
System.out.println("Enter the no.of mile");
mil=o.nextDouble();
km=mil*1.6;
m=mil*1609;
System.out.println("Miles="+mil+"Kilometers="+km);
}
public void mtomilkm()
{
System.out.println("Enter the no.of meters");
m=o.nextDouble();
mil=m/1069;
km=m/1000;
System.out.println("Miles"+mil+"Kilo meters="+km);
}
}
