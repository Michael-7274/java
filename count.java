import java.io.*;
class count
{
public static void main(String args[]) throws IOException
{
File f1=new File("F:\\count1\\tocount.txt");
FileInputStream obj=new FileInputStream(f1);
InputStreamReader obj1=new InputStreamReader(obj);
BufferedReader obj2=new BufferedReader(obj1);
String t;
t=obj2.readLine();
int words=0;
int ch=0;
int sent=0;
int para=1;
int space=0;
while(t!=null)
{
if(t.equals(" "))
{
 para++;
}
else
{
ch+=t.length();
String word_content[]=t.split(" ");
words+=word_content.length;
String Sent_con[]=t.split("adcde+");
sent+=Sent_con.length;
space+=words-1;
}
} 
System.out.println(ch);
System.out.println(words);
System.out.println(sent);
System.out.println(para);
System.out.println(space);
}
}
/*incomplete*/