import java.io.*;
import java.util.*;
import java.net.Socket;
public class clientone {
      public static void main(String[] args) throws IOException {
         
     Socket s=new Socket("localhost",1234);;
     InputStreamReader inpsr= new InputStreamReader(s.getInputStream());
     OutputStreamWriter osw=new OutputStreamWriter(s.getOutputStream());
      BufferedReader bfr= new BufferedReader(inpsr);
    BufferedWriter bfw=new BufferedWriter(osw);
    Scanner sc = new Scanner(System.in);
    try
   {
        while(true)
               {
               String msg=sc.nextLine();
               bfw.write(msg);
               bfw.newLine();
               bfw.flush();
                System.out.println("Server:"+bfr.readLine());

               }
        
    

   }
   catch(IOException e){
       
   }
   

}
}
