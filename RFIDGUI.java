import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class RFIDGUI extends JPanel {
	/*private JLabel label;*/
	public static JTextField Question = new JTextField(ThreadTwoTestTwo.randomQuestionStatement);
	//public static JTextField Points = new JTextField("0"/*ThreadTwoTestTwo.playerPoints*/);
	public static JFrame Placeholder0 = new JFrame(" ");
	public static JFrame Placeholder1 = new JFrame(" ");
	public static JFrame Placeholder2 = new JFrame(" ");
	public static JFrame Placeholder3 = new JFrame(" ");
	public static JFrame Placeholder4 = new JFrame(" ");
	public static JFrame Placeholder5 = new JFrame(" ");
	public static JFrame Placeholder6 = new JFrame(" ");
	public static JFrame Placeholder7 = new JFrame(" ");
	public static JFrame Placeholder8 = new JFrame(" ");
	public static boolean Inter = true;
	public static boolean secondDoneYet = false;
	public int count = 0;
	Point p = new Point(1600,900);

	public RFIDGUI() {
		
		setLayout(new FlowLayout());
		//label = new JTextField(ThreadTwoTestTwo.randomQuestionStatement);
		Question.setFont(new Font("Serif", Font.BOLD, 18));
		//Points.setFont(new Font("Serif", Font.BOLD, 50));
		//Question.setBounds(300, 250, 900, 300);
		//Points.setBounds(1200, 600, 300, 200);

		//Points.setHorizontalAlignment(JTextField.RIGHT);
		//Points.set
		Question.setForeground(Color.blue);
		//Points.setForeground(Color.red);
		add(Question);
		//Question.validate();
		//add(Points, BorderLayout.SOUTH);
		//Points.validate();
		//Question.setLocation(0, 0);
		//Points.setLocation(1600,900);

		/*while(count<70){
			//secondDoneYet = false;
			while (!secondDoneYet) {
				//label = new JTextField(ThreadTwoTestTwo.randomQuestionStatement);
				label.repaint();
				secondDoneYet = true;
				count++;

				/*
				 * while(ThreadTwoTestTwo.amountOfQuestions <=60){
				 * label.repaint(); }
				 */
			}
		//}
		}
	//}

	/*
	 * public JFrame Tester = new
	 * JFrame("The Tiny Tinkering Elves Present: World Geography Breakdown");
	 * private JPanel pnlNorth = new JPanel(); private JPanel pnlSouthWest = new
	 * JPanel(); private JPanel pnlSouthEast = new JPanel();
	 */


