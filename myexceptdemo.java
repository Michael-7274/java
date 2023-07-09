import java.lang.Exception;
import java.util.*;
class AgeInvalidException extends Exception
{
AgeInvalidException(String msg)
{
super(msg);
}
}
class myexceptdemo
{
public static void main(String args[])
{
int age;

Scanner input=new Scanner(System.in);
System.out.println("Enter Age");
age=input.nextInt();
try
{
if(age<18)
throw new AgeInvalidException("You Are not eligle for voting");
else
System.out.println("You Are eligible for voting");
}
catch(AgeInvalidException e)
{
System.out.println("this is my exception block");
System.out.println(e.getMessage());
}
finally
{
System.out.println("THANK YOU ");
System.out.println("Finally block End of the program");
}
}
}
