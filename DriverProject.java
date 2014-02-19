import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class DriverProject extends Thread {
	public static boolean doneYet = false;
	public void run() {
	
				JFrame frame = new JFrame(
						"The Tiny Tinkering Elves Present: World Geography Breakdown");
				frame.setSize(1600, 100);
				frame.setLocation(00, 00);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setContentPane(new RFIDGUI());
				frame.setVisible(true);
				//RFIDGUI.Question.setLocation(0, 0);

		
	}

}
