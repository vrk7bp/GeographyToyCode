//Gautam

import java.io.IOException;
import java.util.Scanner;

import com.phidgets.*;
import com.phidgets.event.*;

public class ProjectRFID {
	// All of the Static and Public Variables
	static int count = 0;
	static Question Test;
	public Question[] questions;
	public PointCounter Work;
	static boolean doneYet = false;
	public Question Tempor;
	static boolean Inter = false;
	public static int intCounter = 0;
	static Scanner sc;

	public static void main(String args[]) throws Exception {
		// Declaring the Array and the items in each array, along with a
		// variable
		// final Question Tempor = Work.randomQuestion();

		Question[] questions = new Question[3];
		questions[0] = new Question("This is the first question", "010693581c", 1, 1, "");
		questions[1] = new Question("This is the second question", "010693581c", 1, 1, "");
		questions[2] = new Question("This is the third question", "010693581c", 1, 1, "");
		
		final PointCounter Work = new PointCounter(questions);

		// This if from the given example, this part mainly just turns on the
		// RFID Sensor
		final RFIDPhidget rfid;
		rfid = new RFIDPhidget();

		rfid.addAttachListener(new AttachListener() {
			public void attached(AttachEvent ae) {
				try {
					// System.out.println("RFID antenna attached.");
					((RFIDPhidget) ae.getSource()).setAntennaOn(true);
					((RFIDPhidget) ae.getSource()).setLEDOn(true);
				} catch (PhidgetException ex) {
				}
			}
		});

		rfid.addTagGainListener(new TagGainListener() {
			public void tagGained(TagGainEvent oe) {
				String Temp;
				Temp = null;

				//Test = Work.randomQuestion();
				//Test.display();
				Temp = oe.getValue();
				if (Test.getRFIDTag().equals(Temp)) {
					System.out.println("You are Correct");
					count++;
					System.out.println(count);
					
					System.out.println("before count check...");
					if(count == 2)
					{
						System.out.println("Congratulations, you are finished.");
//						sc.close();
					}
					System.out.println("after count check...");
				}
				else{
					System.out.println("Sorry, try again!!!");
					doneYet = false;
				}
				System.out.println("end of handler...");
			}
		});
		
		
		count = 0;
		doneYet = false;
		Test = null;
		sc = null;

		// This is where the manipulation starts. As of right now, this is
		// creating an infinite loop.
		while (!doneYet) {
			
			Test = Work.randomQuestion();
			Test.display();			
			System.out.println("after listener...");
			rfid.openAny();
			System.out.println("opened...");

			rfid.waitForAttachment(1000);
			System.out.println("waited...");

			sc = new Scanner(System.in);
			sc.next();
			sc.close();
			//			System.in.read();
			System.out.println("scanner next...");

			// This is all just necessary methods that need to be called			
			System.out.println("end of while...");
		}
	}

}
