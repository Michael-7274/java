import javax.swing.*;
import java.awt.event.*;
  class calc implements ActionListener
{
    JFrame f;
    JTextField t,k;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr,bsin,bcos,btan,blog;
 
    static double b=0,result=0;
    static int operator=0;
	String c,z="";
	
		int a;
 
    calc()
    {
		
        f=new JFrame("Simple game");
        t=new JTextField();
		k=new JTextField();
        b1=new JButton("Scissor");
        b4=new JButton("paper");
        b7=new JButton("Rock");
		beq=new JButton("play");
        bclr=new JButton("Clear");
        t.setBounds(30,40,280,30);
        b7.setBounds(30,100,280,40);
        b4.setBounds(30,170,280,40);
         b1.setBounds(30,240,280,40);
		beq.setBounds(30,310,280,40);
        bclr.setBounds(30,380,280,40);
        f.add(t);
        f.add(b7);
        f.add(b4);
        f.add(b1);
		f.add(beq);
        f.add(bclr);
        
		f.setLayout(null);
        f.setVisible(true);
        f.setSize(350,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);


         b1.addActionListener(this);
        b7.addActionListener(this);
        b4.addActionListener(this);
        bclr.addActionListener(this);
		beq.addActionListener(this);
        }
 
    public void actionPerformed(ActionEvent e)
    {
		a=(int)(Math.random()*3);
		
		if(a==0)
		{	
		z="rock";
		}
		else if(a==1)
		{		
	    z="paper";
        }
		else if(a==2)
		{
			z="scissor";
		}	
	
        if(e.getSource()==b1)
        {    
	     t.setText("");
		t.setText(t.getText().concat("Scissor"));
        operator=1;
		
		}
        
        if(e.getSource()==b4)
        {   
		t.setText("");
	   t.setText(t.getText().concat("paper"));
        operator=2;
		if(z=="scissor")
					c="Tie";
				if(z=="rock")
					c="You Lose";
				if(z=="paper")
					c="You win";
		t.setText(""+c);		
		}
        
        if(e.getSource()==b7)
		{
			t.setText("");
            t.setText(t.getText().concat("rock"));
            operator=3;
		}
        
		if(e.getSource()==beq)
        {
            
        
            switch(operator)
            {
                case 1: 
				if(z=="scissor")
					c="Tie";
				if(z=="rock")
					c="You Lose";
				if(z=="paper")
					c="You win";
				
                    break;
        
                case 2:  
				if(z=="paper")
					c="Tie";
				if(z=="scissor")
					c="You Lose";
				if(z=="rock")
					c="You win";
                    break;
        
                case 3: 
				if(z=="rock")
					c="Tie";
				if(z=="paper")
					c="You Lose";
				if(z=="scissor")
					c="You win";
                    break;
        
                
		default: result=0;
            }
        
            t.setText(""+c);
        }
        
        if(e.getSource()==bclr)
            t.setText("");
        
                
    }
 
 

   public static void main(String[] args)
    {
        new calc();
    }
}
