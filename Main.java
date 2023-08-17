import java.util.Scanner;
public class Main{

     public static void main(String []args){
    int i=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the digit length");
    int n=sc.nextInt();
    System.out.println("Enter the digits one by one");
    String nm[]=new String[n];

     for(i=0;i<n;i++){
          nm[i]=sc.next();
      }
    
     //System.out.println("Digits");
    //  for(i=0;i<n;i++){
    //      System.out.println(nm[i].length());
    //  }
    
    
     for(i=0;i<n;i++){
     //System.out.println(nm[i].charAt(0)=='.');   
         if(nm[i].charAt(0)=='.')
         {
             if(i+1==n){
                 System.out.println("Invalid number");
                 break;
             }
             for(i=i+1;i<n;i++){

                 if(nm[i].charAt(0)=='.')
                 {
                     System.out.println("Invalid number");
                     break;
                 }
                }
                if(i==n){
            System.out.println("Valid number");
            break;
                }

             
             }
             else if(i==n-1){
                System.out.println("Valid number");
             }


         
     }
     }
    }