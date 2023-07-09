import java.io.*;
import java.util.*;
import java.io.BufferedReader;
class stringsort
{
public static void main(String args[])throws IOException
{
ArrayList<String>obj=new ArrayList<String>();
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int c,ch;
int i,j;
String str,str1;
do
{
System.out.println("        String Manipulation");
System.out.println(" \n ");
System.out.println("1.Append at end \n2.Insert at particular index \n3.Search \n4.List string that start with a particular letter \n5.Size \n6.Remove \n7.Sort \n8.Display \nEnter the choice");
c=Integer.parseInt(in.readLine());
switch(c)
{
case 1:
{
System.out.println("Enter the string");
str=in.readLine();
obj.add(str);
break;
}
case 2:
{
System.out.println("Enter the string");
str=in.readLine();
System.out.println("Specify the index/position to insert");
i=Integer.parseInt(in.readLine());
obj.add(i-1,str);
System.out.println("THE array list has following elements:"+obj);
break;
}
case 3:
{
System.out.println("Enter the string to search");
str=in.readLine();
j=obj.indexOf(str);
if(j==-1)
System.out.println("Element not found");
else
System.out.println("Index of:"+str+"is"+j);
break;
}
case 4:
{
System.out.println("Enter the charcter to List string that starts with specified character");
str=in.readLine();
for(i=0;i<=(obj.size()-1);i++)
{
str1=obj.get(i);
if(str1.startsWith(str))
{
System.out.println(str1);
}
}
break;
}
case 5:
{
System.out.println("Size of the list:"+obj.size());
break;
}
case 6:
{
System.out.println("Enter the element to remove");
str=in.readLine();
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
System.out.println("The array list has following elemets:"+obj);
break;
}
case 8:
{
System.out.println("The array list has following elemets:"+obj);
break;
}
}
System.out.println("Please enter 1 to continue and 0 to break");
ch=Integer.parseInt(in.readLine());
}while(ch==1);
}
}