package mouseListener;

import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MouseDemo1 {
	public static void main(String[] args) {
		demo obj =  new demo();
	}
}

class demo extends JFrame{
	
	//constructor 
	
	public  demo() {
		addMouseListener(new MouseAdapter() {
			//mouse Pressed is not a name 
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getX();
				
				System.out.println(x +" , "+ y);
			}
			

			
		});
		
		//default
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
