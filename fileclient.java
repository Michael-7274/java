import java.io.*;
import java.net.*;
public class fileclient {
    public static void main(String[] args)throws Exception
    {
        byte b[]=new byte[50000];
        int a=1234;
       try{
        Socket s=new Socket("localhost",1235);
        InputStream is= s.getInputStream();
       FileOutputStream  fr=new FileOutputStream("D:\\mine.txt"); 
       while(true)
       {
       is.read(b,0,b.length);
       fr.write(b,0,b.length);
       }
    }
    catch(Exception e)
    {}
}
}
