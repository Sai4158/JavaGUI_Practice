package mouseListener;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseDemo {
	public static void main(String[] args) {
		xyz obj = new xyz();
	}
}

//class
class xyz extends JFrame{
	//constructor
	public xyz(){
		
		//add add Mouse Listener 
		//add New Mouse adapter = 
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				System.out.println(x + " , " + y);
			}
		});
		
		//default
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}