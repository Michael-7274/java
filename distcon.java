import distpack.dist;
import java.io.*;
import java.util.Scanner;
class distcon
{
public static void main(String args[])
{
Scanner o=new Scanner(System.in);
int ch;
dist t=new dist();
do
{
System.out.println("1.kilometer to miles and meter");
System.out.println("2.miles to kilo meter and meter");
System.out.println("3.meter to kilometer and miles");
System.out.println("Enter your choice:");
ch=o.nextInt();
switch(ch)
{
case 1:
{
t.kmtomilm();
break;
}
case 2:
{
t.miltokmm();
break;
}
case 3:
{
t.mtomilkm();
break;
}
}
System.out.println("Enter 0 to quit and 1 to continue");
ch=o.nextInt();
}while(ch==1);
}
}