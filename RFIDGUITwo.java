import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class RFIDGUITwo extends JPanel {
	
	public static JTextField Points = new JTextField("   " + ThreadTwoTestTwo.playerPoints + "   ");

	public RFIDGUITwo() {

		setLayout(new FlowLayout());
		// label = new JTextField(ThreadTwoTestTwo.randomQuestionStatement);
		//Question.setFont(new Font("Serif", Font.BOLD, 30));
		Points.setFont(new Font("Serif", Font.BOLD, 200));
		// Question.setBounds(300, 250, 900, 300);
		// Points.setBounds(1200, 600, 300, 200);

		// Points.setHorizontalAlignment(JTextField.RIGHT);
		// Points.set
		//Question.setForeground(Color.blue);
		Points.setForeground(Color.red);
		//add(Question, BorderLayout.NORTH);
		//Question.validate();
		add(Points);
		//Points.validate();
		// Question.setLocation(0, 0);
		// Points.setLocation(1600,900);

		/*
		 * while(count<70){ //secondDoneYet = false; while (!secondDoneYet) {
		 * //label = new JTextField(ThreadTwoTestTwo.randomQuestionStatement);
		 * label.repaint(); secondDoneYet = true; count++;
		 * 
		 * /* while(ThreadTwoTestTwo.amountOfQuestions <=60){ label.repaint(); }
		 */
	}
	// }
}
// }

