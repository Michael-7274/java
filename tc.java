import java.io.*;
import java.util.Scanner;
import tconv.timer;
class tc
{
public static void main(String args[])
{
Scanner o=new Scanner(System.in);
int ch;
timer t=new timer();
do
{
System.out.println("1.Hours to minutes and seconds");
System.out.println("2.seconds to hours and minutes");
System.out.println("3.Minutes to seconds and hours");
System.out.println("Enter your choice:");
ch=o.nextInt();
switch(ch)
{
case 1:
{
t.htomins();
break;
}
case 2:
{
t.stohmin();
break;
}
case 3:
{
t.mintohs();
break;
}
}
System.out.println("Enter 0 to quit and 1 to continue");
ch=o.nextInt();
}while(ch==1);
}
}