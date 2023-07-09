import java.util.*;
import java.io.*;
public class Arraylistexample1
{
public static void main(String args[]) throws IOException
{
ArrayList<String> obj = new ArrayList<String>();
Scanner sc=new Scanner(System.in);
int c,ch;
int i,j;
String str,str1;
do
{
System.out.println("STRING MANIPULATION");
System.out.println("************************");
System.out.println(" 1.Append at end \n 2.Insert at particular position \n 3.Search ");
System.out.println(" 4.List string that starting with letter ");
System.out.println(" 5.Size \n 6.Remove \n 7.Sort \n 8.Display\n 9.Exit" );
System.out.println("Enter the choice ");
c=sc.nextInt();
switch(c)
{
case 1:
{
System.out.println("Enter the string ");
str=sc.next();
obj.add(str);
break;
}
case 2:
{
System.out.println("Enter the string ");
str=sc.next();
System.out.println("Specify the position to insert");
i=sc.nextInt();
obj.add(i-1,str);
System.out.println("The array list has following elements:"+obj);
break;
}
case 3:
{
System.out.println("Enter the string to search ");
str=sc.next();
j=obj.indexOf(str);
if(j==-1)
System.out.println("Element not found");
else
System.out.println("Position of:"+str+" is "+j+1);
break;
}
case 4:
{
System.out.println("Enter the character to List the string that starts with the specified character");
str=sc.next();
for(i=0;i<(obj.size());i++)
{
str1=obj.get(i);
if(str1.startsWith(str,0))
{
System.out.println(str1);
}
}
break;
}
case 5:
{
System.out.println("Size of the list "+obj.size());
break;
}
case 6:
{
System.out.println("Enter the element to remove");
str=sc.next();
if(obj.remove(str))
{
System.out.println("Element Removed"+str);
}
else
{
System.out.println("Element not present");
}
break;
}
case 7:
{
Collections.sort(obj);
System.out.println("The array list has following elements:"+obj);
break;
}
case 8:
{
System.out.println("Sorted \nThe array list has following elements:"+obj);
break;
}
default:
{
System.exit(0);
}
}
System.out.println("Please Enter 0 to break and 1 to continue");
ch=sc.nextInt();
}while(ch==1);
}
}