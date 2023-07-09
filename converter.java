import ConversionDemo.CurrencyConverter;
import java.util.Scanner;
class converter
{
public static void main(String[] args)throws NoClassDefFoundError
{
double CurrentExchange;
int choice1;
char ans;
double inr;
Scanner input=new Scanner(System.in);
System.out.println("\t currency conversion");
do
{
System.out.println("menu for currency conversion");
System.out.println("1.Dollar to INR");
System.out.println("2.INR TO dollar");
System.out.println("3.Euro to INR");
System.out.println("4.INR to Euro");
System.out.println("5.Yen to INR");
System.out.println("6.INR to YEN");
System.out.println("enter your choice:");
choice1=input.nextInt();
System.out.println("please enter the current exchange rate:");
CurrentExchange=input.nextDouble();
CurrencyConverter cc=new CurrencyConverter(CurrentExchange);
switch(choice1)
{
case 1:
System.out.print("enter dollars:");
double dollar=input.nextDouble();
System.out.println(dollar+"dollars are converted to "+cc.DollarToINR(dollar)+"Rs");
break;




case 2:
System.out.print("enter INR:");
inr=input.nextDouble();
System.out.println(inr+"Rs.are converted to "+cc.INRToDollar(inr)+ "Dollars");
break;
case 3:
System.out.print("enter euro:");
double euro=input.nextDouble();
System.out.println(euro+"euros are converted to "+cc.EuroToINR(euro)+"Rs.");
break;
case 4:
System.out.print("Enter INR:");
inr=input.nextDouble();
System.out.println(inr+"Rs.are converted to "+cc.INRToEuro(inr)+"Euros");
break;
case 5:
System.out.print("enter Yen:");
double yen=input.nextDouble();
System.out.println(yen+"yens are converted to "+cc.YenToINR(yen)+"Rs.");
break;
case 6:
System.out.print("enter INR:");
inr=input.nextDouble();
System.out.println(inr+"Rs.are converted to "+cc.INRToYen(inr)+"Yens");
break;
}
System.out.println("do you want to go to currency conversion menu?(y/n)");
ans=input.next().charAt(0);
}while(ans=='y');
}
}

