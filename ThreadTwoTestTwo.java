import java.util.Random;

public class ThreadTwoTestTwo extends Thread {
	static String randomQuestionStatement;
	static int playerPoints = 0;
	public String TempOne;
	public String TempTwo;
	static String NorthAmerica = "4d004aac0d";
	static String SouthAmerica = "4d004a78dc";
	static String Australia = "4d004a9e20";
	static String Asia = "4d004a4e5a";
	static String Asian = "4d004a4e5a";
	static String Antarc = "4d004a8416";
	static String Europe = "4d004aac7f";
	static String Africa = "4d004a6940";
	static String Af = "4d004a6940";
	static String SouthOcean = "4d004a6f47";
	static String AtlanticOcean = "4d004a84f2";
	static String PacificOcean = "4d004a8a4e";
	static String IndianOcean = "4d004ab626";
	static String ArcticOcean = "4d004ab31c";
	static boolean done = false;
	static int RFIDTracker = 5;
	public boolean newTry = false;
	static int count = 0;
	public int Attempts = 0;
	public static int amountOfQuestions = 0;
	static Question Test;
	public Random generator = new Random();
	public Question[] Bank;
	public int questionPicked;
	public PointCounter Work;
	static boolean doneYet = false;
	public Question Tempor;
	static boolean Inter = false;
	public static int intCounter = 0;
	public Question questionTemp;
	public static boolean secondNotDoneYet = false;

	public ThreadTwoTestTwo() {
		/*
		 * Question[] Bank = new Question[10]; Bank[0] = new
		 * Question("This is the first question", "010693581c", 1, 1,
		 * "North America"); Bank[1] = new
		 * Question("This is the second question", "010693581c", 1, 1,
		 * "South America"); Bank[2] = new
		 * Question("This is the third question", "010693581c", 1, 1,
		 * "North America"); Bank[3] = new
		 * Question("This is the fourth question", "010693581c", 1, 1,
		 * "South America"); Bank[4] = new
		 * Question("This is the fifth question", "010693581c", 1, 1,
		 * "North America"); Bank[5] = new
		 * Question("This is the sixth question", "010693581c", 1, 1,
		 * "South America"); Bank[6] = new
		 * Question("This is the seventh question", "010693581c", 1, 1,
		 * "North America"); Bank[7] = new
		 * Question("This is the eighth question", "010693581c", 1, 1,
		 * "South America"); Bank[8] = new
		 * Question("This is the ninth question", "010693581c", 1, 1,
		 * "North America"); Bank[9] = new
		 * Question("This is the tenth question", "010693581c", 1, 1,
		 * "South America");
		 */

		/*
		 * questions = new Question[3]; questions[0] = new
		 * Question("This is the first question", "010693581c", 1, 1);
		 * questions[1] = new Question("This is the second question",
		 * "010693581c", 1, 1); questions[2] = new
		 * Question("This is the third question", "010693581c", 1, 1);
		 * 
		 * questionTemp = new Question("This is temp question", "010693581c", 1,
		 * 1);
		 * 
		 * final PointCounter Work = new PointCounter(questions); Test =
		 * Work.randomQuestion(); Test.display();
		 */
	}

	@Override
	public void run() {
		//Attempts = 0;
		int playerPoints = 0;
		int Counter = 0;
		int tries = 0;
		amountOfQuestions = 0;
		doneYet = false;
		secondNotDoneYet = false;
		Question[] Bank = new Question[67];
		Bank[0] = new Question("Which Ocean must you cross to get from Africa to Asia?", IndianOcean, 1, 1, "Indian Ocean");
		Bank[1] = new Question("What Continent are you standing on right now?", NorthAmerica, 1, 1, "North America");
		Bank[2] = new Question("Which Ocean must you cross in order to take the shortest route from North America to Europe?", AtlanticOcean, 1, 1, "Atlantic Ocean");
		Bank[3] = new Question("Which Ocean must you cross to get from Africa to Australia?", IndianOcean, 1, 1, "Indian Ocean");
		Bank[4] = new Question("What Continent is Virginia in?", NorthAmerica, 1, 1, "North America");
		Bank[5] = new Question("What is the first Ocean you would cross going from Antarctica to North America?", SouthOcean, 1, 1, "Southern Ocean");
		Bank[6] = new Question("Which Continent has Giraffes and Zebras living in the wild?", Africa, 1, 1, "Africa (wild Elephants also live there)");
		Bank[7] = new Question("Which is the first Ocean that you would cross going from Europe to Antarctica?", AtlanticOcean, 1, 1, "Atlantic Ocean");
		Bank[8] = new Question("What Continent is attached to Asia other than Africa?", Europe, 1, 1, "Europe");
		Bank[9] = new Question("Which is the Largest Continent?", Asia, 1, 1, "Asia");
		Bank[10] = new Question("Clark Elementary School is in what Continent?", NorthAmerica, 1, 1, "North America");
		Bank[11] = new Question("Which is the Smallest Continent?", Australia, 1, 1, "Australia");
		Bank[12] = new Question("If you sail North of Africa, which Continent would you land on?", Europe, 2, 2, "Europe");
		Bank[13] = new Question("If you sail South of Africa, which Continent would you land on?", Antarc, 2, 2, "Antarctica");
		Bank[14] = new Question("If you sail East of North America, which Continent would you land on other than Africa?", Europe, 2, 2, "Europe");
		Bank[15] = new Question("If you sail East of Australia, which Continent would you land on?", SouthAmerica, 2, 2, "South America");
		Bank[16] = new Question("If you sail North of South America, which Continent would you land on?", NorthAmerica, 2, 2, "North America");
		Bank[17] = new Question("If you sail West of Europe, which Continent would you land on?", NorthAmerica, 2, 2, "North America");
		Bank[18] = new Question("If you sail West of Australia, which Continent would you land on other than South America?", Africa, 2, 2, "Africa");
		Bank[19] = new Question("If you sail South of Europe, which Continent would you land on?", Africa, 2, 2, "Africa");
		Bank[20] = new Question("If you sail West of North America, which Continent would you land on?", Asia, 2, 2, "Asia");
		Bank[21] = new Question("Which Ocean must you cross in order to take the shortest route from Asia to North America?", PacificOcean, 2, 2, "Pacific Ocean");
		Bank[22] = new Question("Which Continent must you cross in order to take the shortest route from the Indian Ocean to the Atlantic Ocean? ", Africa, 2, 2, "Africa");
		Bank[23] = new Question("Which Continent are Kangaroos from?", Australia, 2, 2, "Australia");
		Bank[24] = new Question("Which is the Southern-Most Continent?", Antarc, 3, 3, "Antarctica");
		Bank[25] = new Question("Which is the Northern Most Ocean?", ArcticOcean, 3, 3, "Arctic Ocean");
		Bank[26] = new Question("Which is the Southern-Most Ocean?", SouthOcean, 3, 3, "Southern Ocean");
		Bank[27] = new Question("Pizza was invented in which Continent?", Europe, 3, 3, "Europe (it was made in Italy, which is a country in Europe)");
		Bank[28] = new Question("What Continent has the coldest temperatures?", Antarc, 3, 3, "Antarctica");
		Bank[29] = new Question("Which Ocean did Christopher Columbus Cross?", AtlanticOcean, 3, 3, "Atlantic Ocean");
		Bank[30] = new Question("What is the Largest Ocean?", PacificOcean, 3, 3, "Pacific Ocean");
		Bank[31] = new Question("What Continent is the Amazon Rainforest in?", SouthAmerica, 3, 3, "South America");
		Bank[32] = new Question("What Continent is Washington D.C. located on?", NorthAmerica, 3, 3, "North America");
		Bank[33] = new Question("The 2012 Olympic Games are happening in London next year. What Continent is London in?", Europe, 3, 3, "Europe");
		Bank[34] = new Question("What Continent is the Queen of England from?", Europe, 3, 3, "Europe");
		Bank[35] = new Question("What is the smallest Ocean in the World?", ArcticOcean, 3, 3, "Arctic Ocean");
		Bank[36] = new Question("Russia is considered part of two Continents. Aside from Asia, what is the other Continent?", Europe, 4, 4, "Europe");
		Bank[37] = new Question("The city of Chicago is in what Continent?", NorthAmerica, 4, 4, "North America");
		Bank[38] = new Question("What Continent is the Grand Canyon located in?", NorthAmerica, 4, 4, "North America (its in Arizona)");
		Bank[39] = new Question("The city of Rio De Janerio (host of the 2016 Olympics) is in what Continent?", SouthAmerica, 4, 4, "South America");
		Bank[40] = new Question("The Bengal Tiger is on the Endangered Species List. What Continent do they come from?", Asia, 4, 4, "Asia");
		Bank[41] = new Question("The Eifel Tower is located in France. What Continent is France in?", Europe, 4, 4, "Europe");
		Bank[42] = new Question("What is the deepest Ocean?", PacificOcean, 4, 4, "Pacific Ocean (it is deeper than Mt. Everest is high");
		Bank[43] = new Question("The Mayans were an ancient civilization that lived more that 2000 years ago. What Continent do they originate from?", NorthAmerica, 4, 4, "North America");
		Bank[44] = new Question("Which Continent is also a Country?", Australia, 4, 4, "Australia");
		Bank[45] = new Question("What Continent are Penguins found in?", Antarc, 4, 4, "Antarctica");
		Bank[46] = new Question("The Taj Mahal was built nearly 400 years ago. What Continent is it located in?", Asia, 4, 4, "Asia");
		Bank[47] = new Question("The world's largest mountain, Mt. Everest, is located on what Continent?", Asia, 4, 4, "Asia");
		Bank[48] = new Question("I am standing on the Great Wall of China. What Continent am I in?", Asia, 5, 5, "Asia");
		Bank[49] = new Question("Which Continent are in all four Hemispheres?", Africa, 5, 5, "Africa");
		Bank[50] = new Question("Humans were said to originate from what Continent?", Africa, 5, 5, "Africa");
		Bank[51] = new Question("Which Continent has the smallest Population?", Antarc, 5, 5, "Antarctica");
		Bank[52] = new Question("Which Continent is the Great Barrier Reef in?", Australia, 5, 5, "Australia");
		Bank[53] = new Question("Both the Equator and the Prime Meridian run through which Continent?", Africa, 5, 5, "Africa");
		Bank[54] = new Question("Where is the Nile River, the world's largest river, located?", Africa, 5, 5, "Africa");
		Bank[55] = new Question("What Continent is the World's Largest Waterfall (Angel Falls) in?", SouthAmerica, 5, 5, "South America");
		Bank[56] = new Question("Which Ocean is almost entirely covered in ice year-round?", ArcticOcean, 5, 5, "Arctic Ocean");
		Bank[57] = new Question("The original Olympic Games were held in Ancient Greece. In current times, what Continent is this?", Europe, 5, 5, "Europe");
		Bank[58] = new Question("What Ocean is approximately half the size of the Pacific Ocean?", AtlanticOcean, 5, 5, "The Atlantic Ocean");
		Bank[59] = new Question("Nova Scotia is one of the regions in a relatively chilly country. What continent is Nova Scotia in?", NorthAmerica, 5, 5, "North America (Nova Scotia is in Canada)");
		Bank[60] = new Question("What is the Light Green Continent?", NorthAmerica, 1, 1, "North America");
		Bank[61] = new Question("What is the Dark Green Continent?", SouthAmerica, 1, 1, "South America");
		Bank[62] = new Question("What is the Red Continent?", Europe, 1, 1, "Europe");
		Bank[63] = new Question("What is the Orange Continent?", Asia, 1, 1, "Asia");
		Bank[64] = new Question("What is the Yellow Continent?", Africa, 1, 1, "Africa");
		Bank[65] = new Question("What is the Purple Continent?", Australia, 1, 1, "Australia");
		Bank[66] = new Question("What Continent is not on the map?", Antarc, 3, 3, "Antarctica");
		//System.out.println(Bank.length);
		
		
		
		
		/*Bank[0] = new Question("This is the first question", "010693581c", 1,
				1, "North America");
		Bank[1] = new Question("This is the second question", "010693581c", 1,
				1, "South America");
		Bank[2] = new Question("This is the third question", "010693581c", 1,
				1, "North America");
		Bank[3] = new Question("This is the fourth question", "010693581c", 1,
				1, "South America");
		Bank[4] = new Question("This is the fifth question", "010693581c", 1,
				1, "North America");
		Bank[5] = new Question("This is the sixth question", "010693581c", 1,
				1, "South America");
		Bank[6] = new Question("This is the seventh question", "010693581c", 1,
				1, "North America");
		Bank[7] = new Question("This is the eighth question", "010693581c", 1,
				1, "South America");
		Bank[8] = new Question("This is the ninth question", "010693581c", 1,
				1, "North America");
		Bank[9] = new Question("This is the tenth question", "010693581c", 1,
				1, "South America");*/
		/*
		 * if (ThreadOne.in != null) { System.out.println("T2:" + ThreadOne.in);
		 * } try { Thread.sleep(10000); } catch (InterruptedException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */
		// String TempOne;
		// String TempTwo;
		
		//Counter = 0;

		QuestionExecution: while (!doneYet) {
			RFIDGUI.secondDoneYet = false;

			secondNotDoneYet = false;
			int questionPicked = generator.nextInt(67);
			if (!Bank[questionPicked].isQuestionFinished()) {
				Bank[questionPicked].display();
				amountOfQuestions++;
				Bank[questionPicked].setQuestionFinished(true);
			} else if (amountOfQuestions == 67) {
				System.out
						.println("We ran out of questions, better luck next time");
				break QuestionExecution;
			} else {
				questionPicked = generator.nextInt();
				continue QuestionExecution;
			}
			DriverProject.doneYet = true;
			randomQuestionStatement = Bank[questionPicked].getStatement();
			RFIDGUI.Question.setText(randomQuestionStatement);
			RFIDGUITwo.Points.setText("  " + Integer.toString(playerPoints) + "  ");
			//Look here
			
			
			//RFIDGUI.Question.setLocation(0, 0);
			
			
			//look here
			//RFIDGUI.Question.setPreferredSize(RFIDGUI.Question.getPreferredSize());
			RFIDGUI.Question.repaint();
			RFIDGUITwo.Points.repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			AnsweringQuestion: while (secondNotDoneYet == false /*&& ThreadThree.buttonState*/) {
				RFIDGUI.Question.setText(randomQuestionStatement);
				RFIDGUI.Question.repaint();
				// TempOne = ThreadOne.in;
				// TempTwo = ThreadOne.out;
				//RFIDGUI.Inter = true;
				int TryNumber;
				if(!newTry){
					TryNumber = 0;
				}
				else{
					TryNumber = 1;
				}
				//RFIDTracker = 0;
				//TryNumber++;
				//System.out.println("1st " + Attempts);
				if (Bank[questionPicked].getRFIDTag().equals(ThreadOne.in)
						/* && Bank[questionPicked].getRFIDTag().equals(TempTwo) */&& ThreadOne.in != null && ThreadThree.buttonState) {
					//System.out.println("2nd " + TryNumber);
					//TryNumber--;
					RFIDGUI.Question.setText("Nice job, you are correct." /*That question was a level " + Bank[questionPicked].DiffLevel + " question." /*You got " + Bank[questionPicked].getPointValue() + " points for it."*/);
					//here
					
					RFIDGUI.Question.repaint();
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//here
					System.out.println("Nice job, you are correct. That question was a level " + Bank[questionPicked].DiffLevel + " question."/* You got " + Bank[questionPicked].getPointValue() + " points for it."*/);
					RFIDGUI.Question.setText(randomQuestionStatement);
					playerPoints= playerPoints + Bank[questionPicked].getPointValue();
					count++;
					Counter++;
					tries++;
					//here
					RFIDGUI.Question.setText("You have " + playerPoints + " Point(s)");
					RFIDGUI.Question.repaint();
					RFIDGUITwo.Points.setText("  " + Integer.toString(playerPoints) + "  ");
					RFIDGUITwo.Points.repaint();
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//here
					System.out.println("You have " + playerPoints + " Points");
					//System.out.println("before count check...");
					newTry = false;
					RFIDTracker = 5;
					//TryNumber = 0;
					// TempOne = "";
					// TempTwo = ""; 
					if (playerPoints >= 20) {
						//here
						RFIDGUI.Question.setText("Congratulations, you are finished.");
						RFIDGUI.Question.repaint();
						try {
							Thread.sleep(3500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//here
						System.out
								.println("Congratulations, you are finished.");
						doneYet = true;
					} else {
						// Test = Work.randomQuestion();
						// Test = questionTemp;
						// Test.display();
						ThreadOne.in = null;
						continue QuestionExecution;
					}
					secondNotDoneYet = true;
					//ThreadOne.in = null;
					// System.out.println("after count check...");
				} else if (ThreadOne.in != null && TryNumber == 1 && ThreadThree.buttonState) {
					//here
					RFIDGUI.Question.setText("Nice Try, you were almost there. The correct answer was "
							+ Bank[questionPicked].getContinent());
					RFIDGUI.Question.repaint();
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//here
					System.out
							.println("Nice Try, you were almost there. The correct answer was "
									+ Bank[questionPicked].getContinent());
					//Attempts = 0;
					newTry = false;
					Counter++;
					tries++;
					ThreadOne.in = null;
					continue QuestionExecution;
				} else if (ThreadOne.in != null && ThreadThree.buttonState) {
					//System.out.println(TryNumber);
					//here
					RFIDGUI.Question.setText("Sorry, try again!!!");
					RFIDGUI.Question.repaint();
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//here
					System.out.println("Sorry, try again!!!");
					ThreadOne.in = null;
					tries++;
					newTry = true;
					continue AnsweringQuestion;
				}
			}

		}

		// This is all just necessary methods that need to be called
		//System.out.println("end of everything...");
		RFIDGUI.Question.setText("Nice Job, it only took you " + Counter + " questions." /*and " + tries + " tries to finish the game."*/);
		RFIDGUI.Question.setPreferredSize(RFIDGUI.Question.getPreferredSize());
		RFIDGUI.Question.repaint();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		RFIDGUI.Question.setText("It took you  " + tries + " tries to finish the game.");
		RFIDGUI.Question.setPreferredSize(RFIDGUI.Question.getPreferredSize());
		RFIDGUI.Question.repaint();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RFIDGUI.Question.setText("Your Answer Percentage was " + ((double)Counter/(double)tries)*100 + " Percent");
		RFIDGUI.Question.setPreferredSize(RFIDGUI.Question.getPreferredSize());
		RFIDGUI.Question.repaint();
		System.out.println("Nice Job, it only took you " + Counter + " questions and " + tries + " tries to finish the game.");
		System.out.println("Your Answer Percentage was about " + (Counter/tries)*100 + " Percent");

	}

}
