import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.*;

import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.awt.Dialog;

import java.awt.Font;
import java.awt.Color;

import java.awt.Toolkit;

import java.awt.event.ItemListener; //radiobutton
import java.awt.event.ItemEvent;    //radiobutton

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.text.DecimalFormat;

public class LaboratoryExam extends JFrame implements ActionListener,ItemListener
{
	JFrame f;
	JButton b;
	JPanel JPr,JPc;
	
		JLabel menu,welcome,L1,L2,L3,L4,L5,L6,line;
		
		JTextField F1,F2;
		
		JRadioButton Personal,Small,Medium,Large,Family;
		
		JCheckBox Cheese,Ham,Bacon,Pepperoni,Salami,MeatBalls,Mushroom,Onions;
		
		JComboBox combo;
		String names[] = {" ---- SELECT ----","With Large Drinks","Without Drinks"};
		
	public LaboratoryExam()
	{
		Container C = getContentPane();
		C.setLayout(new FlowLayout());
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("benisMenu.png"));
		
		C.setBackground(Color.black);
		
		menu = new JLabel(new ImageIcon("beni.png"));
		C.add(menu);
		
		welcome = new JLabel("            WELCOME            ");
		C.add(welcome);
		welcome.setFont(new Font("Algerian",Font.BOLD, 45));
		welcome.setForeground(Color.gray);
		
		L1 = new JLabel("First Name: ");
		C.add(L1);
		L1.setFont(new Font("Trebuchet MS",Font.BOLD, 18));
		L1.setForeground(Color.white);
		
		F1 = new JTextField(10);
		C.add(F1);
		F1.setFont(new Font("Centaur",Font.BOLD, 15));
		F1.setForeground(Color.black);
		F1.setBackground(Color.LIGHT_GRAY);
		
		L2 = new JLabel("Last Name: ");
		C.add(L2);
		L2.setFont(new Font("Trebuchet MS",Font.BOLD, 18));
		L2.setForeground(Color.white);
		
		F2 = new JTextField(10);
		C.add(F2);
		F2.setFont(new Font("Centaur",Font.BOLD, 15));
		F2.setForeground(Color.black);
		F2.setBackground(Color.LIGHT_GRAY);
		
		L3 = new JLabel("**********************************************************************************************");
		C.add(L3);
		
		L4 = new JLabel("        SIZE OF PIZZA:                                                                        ");
		C.add(L4);
		L4.setFont(new Font("Broadway",Font.BOLD, 15));
		L4.setForeground(Color.gray);
		
		Personal = new JRadioButton("Personal $100");
		C.add(Personal);
		Personal.setFont(new Font("Centaur",Font.BOLD, 18));
		Personal.setForeground(Color.white);
		Personal.setBackground(Color.black);
		Personal.addItemListener(this);
		
		Small = new JRadioButton("Small $150");
		C.add(Small);
		Small.setFont(new Font("Centaur",Font.BOLD, 18));
		Small.setForeground(Color.white);
		Small.setBackground(Color.black);
		Small.addItemListener(this);
		
		Medium = new JRadioButton("Medium $200");
		C.add(Medium);
		Medium.setFont(new Font("Centaur",Font.BOLD, 18));
		Medium.setForeground(Color.white);
		Medium.setBackground(Color.black);
		Medium.addItemListener(this);
		
		Large = new JRadioButton("Large $250");
		C.add(Large);
		Large.setFont(new Font("Centaur",Font.BOLD, 18));
		Large.setForeground(Color.white);
		Large.setBackground(Color.black);
		Large.addItemListener(this);
		
		Family = new JRadioButton("Family $300");
		C.add(Family);
		Family.setFont(new Font("Centaur",Font.BOLD, 18));
		Family.setForeground(Color.white);
		Family.setBackground(Color.black);
		Family.addItemListener(this);
		
		ButtonGroup bGrp = new ButtonGroup();
		bGrp.add(Personal);
		bGrp.add(Small);
		bGrp.add(Medium);
		bGrp.add(Large);
		bGrp.add(Family);
		
		L5 = new JLabel("        CHOOSE YOUR TOPPINGS:                                                      ");
		C.add(L5);
		L5.setFont(new Font("Broadway",Font.BOLD, 15));
		L5.setForeground(Color.gray);
		
		Cheese = new JCheckBox("Cheese");
		C.add(Cheese);
		Cheese.setFont(new Font("Centaur",Font.BOLD, 18));
		Cheese.setForeground(Color.white);
		Cheese.setBackground(Color.black);
		Cheese.addItemListener(this);
		
		Ham = new JCheckBox("Ham");
		C.add(Ham);
		Ham.setFont(new Font("Centaur",Font.BOLD, 18));
		Ham.setForeground(Color.white);
		Ham.setBackground(Color.black);
		Ham.addItemListener(this);
		
		Bacon = new JCheckBox("Bacon");
		C.add(Bacon);
		Bacon.setFont(new Font("Centaur",Font.BOLD, 18));
		Bacon.setForeground(Color.white);
		Bacon.setBackground(Color.black);
		Bacon.addItemListener(this);
		
		Pepperoni = new JCheckBox("Pepperoni");
		C.add(Pepperoni);
		Pepperoni.setFont(new Font("Centaur",Font.BOLD, 18));
		Pepperoni.setForeground(Color.white);
		Pepperoni.setBackground(Color.black);
		Pepperoni.addItemListener(this);
		
		Salami = new JCheckBox("Salami");
		C.add(Salami);
		Salami.setFont(new Font("Centaur",Font.BOLD, 18));
		Salami.setForeground(Color.white);
		Salami.setBackground(Color.black);
		Salami.addItemListener(this);
		
		MeatBalls = new JCheckBox("Meat Balls");
		C.add(MeatBalls);
		MeatBalls.setFont(new Font("Centaur",Font.BOLD, 18));
		MeatBalls.setForeground(Color.white);
		MeatBalls.setBackground(Color.black);
		MeatBalls.addItemListener(this);
		
		Mushroom = new JCheckBox("Mushroom");
		C.add(Mushroom);
		Mushroom.setFont(new Font("Centaur",Font.BOLD, 18));
		Mushroom.setForeground(Color.white);
		Mushroom.setBackground(Color.black);
		Mushroom.addItemListener(this);
		
		Onions = new JCheckBox("Onions");
		C.add(Onions);
		Onions.setFont(new Font("Centaur",Font.BOLD, 18));
		Onions.setForeground(Color.white);
		Onions.setBackground(Color.black);
		Onions.addItemListener(this);
		
		L6 = new JLabel("                            \nDRINKS:                                                                                                        ");
		C.add(L6);
		L6.setFont(new Font("Broadway",Font.BOLD, 15));
		L6.setForeground(Color.gray);
		
		combo = new JComboBox(names);
		C.add(combo);
		combo.setFont(new Font("Centaur",Font.BOLD, 18));
		combo.setForeground(Color.white);
		combo.setBackground(Color.black);
		combo.addItemListener(this);
		
		line = new JLabel("**********************************************************************************************");
		C.add(line); 
		
		b = new JButton("ORDER NOW");
        C.add(b);
        b.setFont(new Font("Blackoak Std",Font.BOLD, 20));
        b.setBackground(Color.DARK_GRAY);
        b.setForeground(Color.LIGHT_GRAY);
		b.addActionListener(this);
		
		JPc = new JPanel(new GridLayout(3,1));
        JPr = new JPanel(new GridLayout(3,1));
		
		setSize(500,815);
		setVisible(true);
		setTitle("Pizza Ordering System");
	}
	public void itemStateChanged (ItemEvent e) //event-handling method -->build-in
	{
	
    }
	
	public void actionPerformed(ActionEvent e)
	{
		float Personals=0;
	    float Smalls=0;
	    float Mediums=0;
	    float Larges=0;
	    float Families=0;
		
 	    float chss=0;
 	    float hmn=0;
 	    float bcn=0;
 	    float ppprn=0;
 	    float slm=0;
 	    float mtblls=0;
 	    float mshrms=0;
 	    float onns=0;
	    
	    float TOTAL, drinks=0;
		
	      String fn, ln ;
		  String sizes="";
		  String top="";
		  String wd="";
		
	      fn = F1.getText();
	      ln = F2.getText();
		  
	    if(Personal.isSelected()){
		
	    	Personals = 100;
	    	sizes+="Personal\n";
	    }
	    else if(Small.isSelected()){
	    	
	    	Smalls = 150;
	    	sizes+="Small\n";
	    }
        else if(Medium.isSelected()){
		
		   	Mediums = 200;
		   	sizes+="Medium\n";
	    }
	    else if(Large.isSelected()){
		
		   	Larges = 250;
		   	sizes+="Large\n";
	    }
	    else if(Family.isSelected()){
		
	    	Families = 300;
	    	sizes+="Family\n";
	    }
		
	    if(Cheese.isSelected()){
		
		   	chss = 50;
		   	top+="Cheese\n";
	    }
	    if(Ham.isSelected()){
		
	    	hmn = 50;
	    	top+="Ham\n";
	    }
	    if(Bacon.isSelected()){
		
		   	bcn = 50;
		   	top+="Bacon\n";
	    }
	    if(Pepperoni.isSelected()){
		
		   	ppprn = 50;
		   	top+="Pepperoni\n";
	    }
	    if(Salami.isSelected()){
		
		   	slm = 50;
		   	top+="Salami\n";
	    }
	    if(MeatBalls.isSelected()){
		
		   	mtblls = 50;
		   	top+="Meat Balls\n";
	    }
		if(Mushroom.isSelected()){
		
		   	mshrms = 50;
		   	top+="Mushroom\n";
	    }
	    if(Onions.isSelected()){
		
		   	onns = 50;
		   	top+="Onions\n";
	    }
	    if(combo.getSelectedIndex()==1){
		
            drinks = 50;
            wd+="With Drinks\n";
        }
	    else if(combo.getSelectedIndex()==2){
	       
	        drinks = 0;
	        wd+="Without Drinks\n";
	    }
		
	    TOTAL = Personals + Smalls + Mediums + Larges + Families + chss + hmn + bcn + ppprn + slm + mtblls + mshrms + onns + drinks;
             
         JOptionPane.showMessageDialog(f, "                        Beni's Pizza"+"\n  De La Salle University - Dasmariñas"+
         	" \n      Dasmariñas, Cavite, Philippines"+"\n                Phone: (046) 416 4531"+
         	"\n\n******************************************\n"+
            								"Customer Name: "+fn+" "+ln+"\n"+
            									"\nPizza Sizes:      "+sizes+"Toppings:          "+top+"Drinks:               "+wd+"\n\nTOTAL:               $"+
            										+TOTAL+"\n******************************************\n","Your Transaction", 
                                  JOptionPane.INFORMATION_MESSAGE);
    
	}
	
    public static void main (String args[])
    {
    	LaboratoryExam M = new LaboratoryExam();
    	M.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}