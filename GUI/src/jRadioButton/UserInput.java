package jRadioButton;
   
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.concurrent.Flow;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class UserInput {
	public static void main(String[] args) {
		radioDemo r =  new radioDemo();
	}
}

class radioDemo extends JFrame{
	//JtextField
	JTextField t1;
	JButton b;
	JRadioButton r1,r2;
	JLabel l;
	JCheckBox c1, c2;
	
	
	public radioDemo() {
		t1 = new JTextField(15);
		b = new JButton("ok");
		r1 =  new JRadioButton("Male");
		r2 =  new JRadioButton("Female");
		l =  new JLabel("Greetings");
		
		//this for the CheckBox 
		c1 =  new JCheckBox("Dancing");
		c2 =  new JCheckBox("Singing");
		
		          
		//this only selects one radio button not both
		//by Grouping.    
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		
		//the order Matters 
		//extends JFrame.
		add(t1);
		add(r1);
		add(r2);
		add(c1);
		add(c2);
		add(b);
		add(l);
		
		
		//item listener for check box 
		c1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//this will print in the console 
				//not on GUI - SYSOUT 
				System.out.println("dancer");
				
			}
		});
		
		//action listener for button 
		b.addActionListener(new ActionListener() {
			
			//logic
			public void actionPerformed(ActionEvent e) {
				//t1 = JTextField
				//will use Get Text and Set Text to modify
				String name = t1.getText();
				
				//is selected method =  boolean value 
				if (r1.isSelected()) {
					name = "Mr. " + name;
				}
				else {
					name = "Ms. " + name;
				}
				
				
				if(c1.isSelected()) {
					name = name + " Dancer";
				}
				if(c2.isSelected()) {
					name = name + " Singer";
				}
				
				//will display the name on the panel 
				//make sure to end it with this
				l.setText(name);
			}
		});
		
		
		
		//window frame
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
}
