package firstGUI;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstGUI extends JFrame {
	public static void main(String[] args) {
		//run the app
		new FirstGUI();
		 
	}
	
	 public FirstGUI() {
		 //WINDOW title
		 super("Sai");
		 abc();
	 }
	 
	public void abc() {
		
		//set layout =  centers the text
		setLayout(new FlowLayout());

		//text 
		JLabel l = new JLabel("Hello World");
		JLabel l2 = new JLabel("Welcome Sai");
		
		//apply them
		add(l);
		add(l2);
		
		//window Size x and y
		setSize(800,400);
		
		//Make it visible
		setVisible(true);
		
		//close on exit
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
