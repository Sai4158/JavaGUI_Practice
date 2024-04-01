package addandSUB;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Clac {
	public static void main(String[] args) {
		AddSub obj = new AddSub();
	}
}

class AddSub extends JFrame implements ActionListener {
	// create the buttons
	JTextField t1, t2;
	JButton b1, b2;
	JLabel l;

	public AddSub() {
		// Define each button
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		b1 = new JButton("ADD");
		b2 = new JButton("SUB");
		l = new JLabel("Result");

		// Add the buttons
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(l);

		// add Action Listener
		b1.addActionListener(this);
		b2.addActionListener(this);

		// window settings
		setLayout(new FlowLayout()); // crtl + shift + i
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	  //import action event
	  
	  public void actionPerformed(ActionEvent ae) { int num1 =
	  Integer.parseInt(t1.getText()); int num2 = Integer.parseInt(t2.getText());
	  
	  //logic 
	  int value = 0;
	  
	  //simple if else statement 
	  if(ae.getSource()==b1) 
		  value = num1 + num2;
	  
	  else value = num1 - num2;
	 
	 
	  l.setText(value + ""); 
	  }
	 

}