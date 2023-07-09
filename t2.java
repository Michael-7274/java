import java.util.*;
import java.io.*;
class t2
{
public static void main(String args[])
{ 
int r=0,z=0,w=6;
System.out.println("The pattern is :");
for(int p=0; p<=3;p++)
{
for(r=0;r<=6;r++)
{ 
if(r==z||r==w)
System.out.print("V");
else
System.out.print(" ");
} 
z++;
w--;
System.out.println("");
}
}
}