//This file still has to be tested with a main method to see how it works.

import java.io.IOException;
import java.util.Random;
import com.phidgets.PhidgetException;
import com.phidgets.RFIDPhidget;
import com.phidgets.event.AttachEvent;
import com.phidgets.event.AttachListener;
import com.phidgets.event.TagGainEvent;
import com.phidgets.event.TagGainListener;


public class PointCounter {
	//Fields
	public String s;		//The String of the tag number of the RFID
	public int Points = 0;
	public Question[] RandomInput;
	public Question forTesting;
	
	//This is the Constructor. There were some weird errors coming up when I was trying to define the Array, so this seemed like a good work around.
	//With this constructor, it means that we have to declare the questions in the main itself so that it can be used.
	public PointCounter(Question[] Input){
		RandomInput = Input;
	}
	
	//A return statement that may become useful in the while loop to determine the amount of points.
	public int getPoints(){
		return Points;
	}
	
	//This is the method that is going to do most of the work, and draws from the other two methods
	public void checkAnswer(String s){
		final Question Intermediate = randomQuestion();		//Creates a temporary question
		String Inter = Intermediate.getRFIDTag();		//Creates a string for the RFID Tag read
		Intermediate.display();		//Writes out the question
		if(Inter.equals(s)){
			System.out.println("You are Correct!!!");		//Checks if the answer is right or wrong and displays the subsequent action, to test this we should use minimal questions
			Points++;
			Intermediate.setQuestionFinished(true);			//This may not work because of the use of Intermediate.
		}
		else if(!Inter.equals(s)){
			System.out.println("Sorry, that is wrong. Please try again.");
		}
	}
	
	//This is the method used to generate a random question
	public Question randomQuestion(){
		Random generator = new Random();		//The Generator
		int questionPicked = generator.nextInt(3);		//Picks a random number from 0 to 59
		if(RandomInput[questionPicked].isQuestionFinished() == true){		//This loop is recursive so that if the question has already been picked the method should restart
			randomQuestion();
		}
		RandomInput[questionPicked].setQuestionFinished(true);
		return RandomInput[questionPicked];		//If the method gets to this point, then it has a new question
	}

	//Most of this is copy and paste from the Simple RFID Example
	/*public String TagNumber() throws PhidgetException, IOException{
		RFIDPhidget rfid;
		rfid = new RFIDPhidget();
		
		rfid.addAttachListener(new AttachListener() {
			public void attached(AttachEvent ae)
			{
				try
				{
					((RFIDPhidget)ae.getSource()).setAntennaOn(true);
					((RFIDPhidget)ae.getSource()).setLEDOn(true);
				}
				catch (PhidgetException ex) { }
			}
		});
		rfid.addTagGainListener(new TagGainListener()
		{
			public void tagGained(TagGainEvent oe)
			{
				s = oe.getValue(); 
			}

		});
		
		//This part of the method may be the iffy part if the RFID Sensor does not work. Look at this.
		rfid.openAny();
		rfid.waitForAttachment(1000);
		System.in.read();
		return s;
	}*/

}


/*Theoretical While loop and Main Method
 * 
 * Define the array full of Questions
 * 
 * Define the PointCounter
 * 
 * 
 * while (Points<10){
 * PointCounter.checkAnswer();
 * PointCounter.getPoints();
 * 
 * }
 * 
 * 
 * 
 */

