package ConversionDemo;
public class CurrencyConverter
{
double ER=0;
public CurrencyConverter(double CurrentExchange)
{
ER=CurrentExchange;
}
public double DollarToINR(double Dollars)
{
double INR=0;
INR=Dollars*ER;
return INR;
}
public double INRToDollar(double INR)
{
double Dollars=0;
Dollars=INR/ER;
return Dollars;
}
public double INRToEuro(double INR)
{
double Euros=0;
Euros=INR/ER;
return Euros;
}
public double EuroToINR(double Euro)
{
double rs=0;
rs=Euro*ER;
return rs;
}
public double YenToINR(double yens)
{
double INR=0;
INR=yens*ER;
return INR;
}
public double INRToYen(double INR)
{
double Yens=0;
Yens=INR/ER;
return Yens;
}
}