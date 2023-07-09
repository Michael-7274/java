import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
class time
{
public static String englishTime(String input)throws ParseException
{
DateFormat dateFormat=new SimpleDateFormat("hh:mm:ss aa");
DateFormat formate=new SimpleDateFormat("HH:mm:ss");
Date time=null;
String output="";
time=dateFormat.parse(input);
output=formate.format(time);
return output;
}
public static void main(String[] arg)throws ParseException
{
System.out.println(englishTime("07:05:45 PM"));
}
}