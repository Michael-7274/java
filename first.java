import javax.swing.*;

import java.awt.event.*;
class first implements ActionListener
{
JFrame f;
JTextField t1,t2,tr;
JButton a,s,d,m,clr;
first()
{
f=new JFrame("CALCULATOR");
f.setSize(5000,5000);
f.setVisible(true);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

t1=new JTextField();
t1.setBounds(150,150,200,200);
f.add(t1);

t2=new JTextField();
t2.setBounds(400,150,200,200);
f.add(t2);

tr=new JTextField();
tr.setBounds(400,550,200,200);
f.add(tr);

a=new JButton("+");
a.setBounds(700,550,100,100);
f.add(a);
a.addActionListener(this);

s=new JButton("-");
s.setBounds(800,550,100,100);
f.add(s);
s.addActionListener(this);

m=new JButton("*");
m.setBounds(900,550,100,100);
f.add(m);
m.addActionListener(this);

d=new JButton("/");
d.setBounds(1000,550,100,100);
f.add(d);
d.addActionListener(this);

clr=new JButton("CLEAR");
clr.setBounds(1100,550,100,100);
f.add(clr);
clr.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
int x,y,z;
if(e.getSource()==a)
{
x=Integer.parseInt(t1.getText());
y=Integer.parseInt(t2.getText());
z=x+y;
tr.setText(Integer.toString(z));
}

else if(e.getSource()==s)
{
x=Integer.parseInt(t1.getText());
y=Integer.parseInt(t2.getText());
z=x-y;
tr.setText(Integer.toString(z));
}

else if(e.getSource()==m)
{
x=Integer.parseInt(t1.getText());
y=Integer.parseInt(t2.getText());
z=x*y;
tr.setText(Integer.toString(z));
}

else if(e.getSource()==d)
{
x=Integer.parseInt(t1.getText());
y=Integer.parseInt(t2.getText());
z=x/y;
tr.setText(Integer.toString(z));
}

else if(e.getSource()==clr)
{
t1.setText(" ");
t2.setText(" ");
tr.setText(" ");
}
}

public static void main(String args[])
{
first o=new first();
}
}