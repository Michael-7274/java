import java.io.*;
import java.net.*;
public class fileserver{

    public static void main(String[] args)throws Exception {
        try{
        ServerSocket ss= new ServerSocket(1235);
        Socket s= new Socket();
        ss.accept();
        FileInputStream fis=new FileInputStream("D:\\one.txt");
        byte b[]=new byte[50000]; 
        while(true)
        {
        fis.read(b,0,b.length);
        OutputStream os=s.getOutputStream();
        os.write(b,0,b.length);
        }
    }
       catch (Exception e) {
            //TODO: handle exception
        }
    }
}
