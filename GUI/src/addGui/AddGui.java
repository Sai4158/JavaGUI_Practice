package addGui;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// this will add 2 numbers in the text field

public class AddGui {
	public static void main(String[] args) {

		Addition obj = new Addition();
	}
	
}

class Addition extends JFrame implements ActionListener {
	//create the buttons
	JTextField t1, t2;
	JButton b;
	Label L1;
	
	public Addition()  {
		super("Sai");
		//text area, 20 is the text field size 
		 t1 =  new JTextField(20);
		 t2 =  new JTextField(20);
		
		//button
		 b = new JButton("ok");
		
		//label
		 L1 =  new Label("Result");
		
		//will add them
		add(t1);
		add(t2);
		add(b);
		add(L1);
		
		b.addActionListener(this);
		
		// stuff
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	
	
	public void actionPerformed(ActionEvent ae) {
		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText());
		
		int value = num1 + num2;
		L1.setText(value + " ");
		
	}
	
	}
