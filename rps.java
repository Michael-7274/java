import java.io.*;
import java.util.Scanner;
public class rps
{
	public static void main(String args[])
	{
		int a,b,c;
		String d;
		do
		{
		System.out.println("Enter your move(rock/paper/scissor/quit)");
		Scanner sc= new Scanner(System.in);
		d=sc.nextLine();
		a=(int)(Math.random()*3);
		String e="";
		if(a==0)
		{	
		e="rock";
		}
		else if(a==1)
		{		
	    e="paper";
        }
		else if(a==2)
		{
			e="scissor";
		}	
		System.out.println("Computer chose:\n"+e);
				System.out.println("result:");
		
		if(d.equals(e))
			System.out.println("tie");
		if(d.equals("rock")&&e.equals("scissor"))
			System.out.println("You win");
        if(d.equals("rock")&&e.equals("paper"))    	
            System.out.println("you lose");			
		if(d.equals("paper")&&e.equals("rock"))
			System.out.println("You win");
        if(d.equals("paper")&&e.equals("scissor"))    	
            System.out.println("you lose");		
        if(d.equals("scissor")&&e.equals("paper"))
			System.out.println("You win");
        if(d.equals("scissor")&&e.equals("rock"))    	
            System.out.println("you lose");			
		}
while(!d.equals("quit"));		
	
	}
	
}