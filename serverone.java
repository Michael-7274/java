import java.io.*;
import java.util.*;
import java.net.ServerSocket;
import java.net.Socket;
public class serverone {
      public static void main(String[] args) throws IOException {
         
     Socket s=null;
     InputStreamReader inpsr=null;
     OutputStreamWriter osw=null;
      BufferedReader bfr=null;
    BufferedWriter bfw=null;
    ServerSocket ss= new ServerSocket(1234);
    while(true)
    {try
        {
        s=ss.accept();
        inpsr=new InputStreamReader(s.getInputStream());
        osw=new OutputStreamWriter(s.getOutputStream());
        bfr=new BufferedReader(inpsr);
        bfw=new BufferedWriter(osw);
        
        while(true)
        {
            String msg = bfr.readLine();
            System.out.println("Client:"+msg);
            bfw.write("Msg received");
            bfw.newLine();
            bfw.flush();
        }
    
    }
    catch (IOException e) {
        
    }
}
}
}

