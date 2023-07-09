import java.io.*;
import java.util.Scanner;
class quore
{
public static void main(String args[])
{
int r,div,did;
int q;
Scanner s=new Scanner(System.in);
System.out.println("Enter the dividened");
did=s.nextInt();
System.out.println("Enter the divisor");
div=s.nextInt();
q=did/div;
r=did%div;
System.out.println("The quotient is,"+q);
System.out.println("The remainder is,"+r);
}
}