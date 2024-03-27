package addGui;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// this will subtract 2 numbers 

public class NewSubtract {
	public static void main(String[] args) {

		sub obj = new sub();
	}
	
}

class sub extends JFrame implements ActionListener {
	//create the buttons
	JTextField g1, g2;
	JButton b;
	Label L1;
	
	public sub()  {
		super("SUBTRACTION");
		//text area, 20 is the text field size 
		 g1 =  new JTextField(20);
		 g2 =  new JTextField(20);
		 b = new JButton("ok");
		 L1 =  new Label("Result");
		
		//will add them
		add(g1);
		add(g2);
		add(b);
		add(L1);
		
		b.addActionListener(this);
		
		// stuff
		setLayout(new FlowLayout());
		setSize(900,800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	
	
	public void actionPerformed(ActionEvent ae) {
		int num1 = Integer.parseInt(g1.getText());
		int num2 = Integer.parseInt(g2.getText());
		
		int value = num1 - num2;
		L1.setText(value + " ");
		
	}
	
	}
