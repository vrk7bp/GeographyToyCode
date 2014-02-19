import javax.swing.JFrame;


public class DriverProjectTwo extends Thread{
	
	public void run(){
		JFrame frame = new JFrame(
				"Your Point Value...");
		frame.setSize(300, 350);
		frame.setLocation(0, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new RFIDGUITwo());
		//frame.setContentPane(new RFIDGUI());
		frame.setVisible(true);
		//RFIDGUI.Question.setLocation(0, 0);
	}

}
