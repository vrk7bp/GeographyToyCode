import java.util.Random;

public class ThreadTwoTest extends Thread {
	public String TempOne;
	public String TempTwo;
	static boolean done = false;
	static int RFIDTracker = 5;
	public boolean newTry = false;
	static int count = 0;
	public int Attempts = 0;
	public int amountOfQuestions = 0;
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
	public boolean secondNotDoneYet = false;

	public ThreadTwoTest() {
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
		doneYet = false;
		secondNotDoneYet = false;
		Question[] Bank = new Question[60];
		Bank[0] = new Question("Which Ocean must you cross to get from Africa to Asia?", "", 1, 1, "Indian Ocean");
		Bank[1] = new Question("What Continent are you standing on right now?", "", 1, 1, "North America");
		Bank[2] = new Question("Which Ocean must you cross in order to take the shortest route from North America to Europe?", "", 1, 1, "Atlantic Ocean");
		Bank[3] = new Question("Which Ocean must you cross to get from Africa to Australia?", "", 1, 1, "Indian Ocean");
		Bank[4] = new Question("Which Ocean must you cross to take the shortest route from Asia to Europe?", "", 1, 1, "");
		Bank[5] = new Question("What is the first Ocean you would cross going from Antarctica to North America?", "", 1, 1, "Southern Ocean");
		Bank[6] = new Question("Which Ocean would you cross to get from South America to Europe?", "", 1, 1, "Atlantic Ocean");
		Bank[7] = new Question("Which is the first Ocean that you would cross going from Europe to Antarctica?", "", 1, 1, "Atlantic Ocean");
		Bank[8] = new Question("What Continent is attached to Asia other than Africa?", "", 1, 1, "Europe");
		Bank[9] = new Question("Which is the Largest Continent?", "", 1, 1, "Asia");
		Bank[10] = new Question("Which Continent is also a Country?", "", 1, 1, "Australia");
		Bank[11] = new Question("Which is the Smallest Continent?", "", 1, 1, "Australia");
		Bank[12] = new Question("If you sail North of Africa, which Continent would you land on?", "", 2, 1, "Europe");
		Bank[13] = new Question("If you sail South of Africa, whic Continent would you land on?", "", 2, 1, "Antarctica");
		Bank[14] = new Question("If you sail East of North America, which Continent would you land on other than Africa?", "", 2, 1, "Europe");
		Bank[15] = new Question("If you sail East of Australia, which Continent would you land on?", "", 2, 1, "South America");
		Bank[16] = new Question("If you sail North of South America, which Continent would you land on?", "", 2, 1, "North America");
		Bank[17] = new Question("If you sail West of Europe, which Continent would you land on?", "", 2, 1, "North America");
		Bank[18] = new Question("If you sail West of Australia, which Continent would you land on other than South America?", "", 2, 1, "Africa");
		Bank[19] = new Question("If you sail South of Europe, which Continent would you land on?", "", 2, 1, "Africa");
		Bank[20] = new Question("If you sail West of North America, which Continent would you land on? ", "", 2, 1, "Asia");
		Bank[21] = new Question("Which Ocean must you cross in order to take the shortest route from Asia to North America?", "", 2, 1, "Pacific Ocean");
		Bank[22] = new Question("Which Continent must you cross in order to take the shortest route from the Indian Ocean to the Atlantic Ocean? ", "", 2, 1, "Africa");
		Bank[23] = new Question("Which Continent are Kangaroos from?", "", 2, 1, "Australia");
		Bank[24] = new Question("Which is the Southern-Most Continent?", "", 3, 1, "Antarctica");
		Bank[25] = new Question("Which is the Northern Most Ocean?", "", 3, 1, "Arctic Ocean");
		Bank[26] = new Question("Which is the Southern-Most Ocean?", "", 3, 1, "Southern Ocean");
		Bank[27] = new Question("Pizza was invented in which Continent?", "", 3, 1, "Europe (it was made in Italy, which is a country in Europe)");
		Bank[28] = new Question("What Continent has the coldest temperatures?", "", 3, 1, "Antarctica");
		Bank[29] = new Question("Which Ocean did Christopher Columbus Cross?", "", 3, 1, "Atlantic Ocean");
		Bank[30] = new Question("What is the Largest Ocean?", "", 3, 1, "Pacific Ocean");
		Bank[31] = new Question("What Continent is the Amazon Rainforest in?", "", 3, 1, "Africa");
		Bank[32] = new Question("What Continent is Washington D.C. located on?", "", 3, 1, "North America");
		Bank[33] = new Question("", "", 3, 1, "");
		Bank[34] = new Question("What Continent is the Queen of England from?", "", 3, 1, "Europe");
		Bank[35] = new Question("", "", 3, 1, "");
		Bank[36] = new Question("Russia is considered part of two Continents. Aside from Asia, what is the other Continent?", "", 4, 1, "Europe");
		Bank[37] = new Question("", "", 4, 1, "");
		Bank[38] = new Question("What Continent is the Grand Canyon located in?", "", 4, 1, "North America (its in Arizona)");
		Bank[39] = new Question("", "", 4, 1, "");
		Bank[40] = new Question("", "", 4, 1, "");
		Bank[41] = new Question("", "", 4, 1, "");
		Bank[42] = new Question("Where is the Brazil, a country, located?", "", 4, 1, "South America");
		Bank[43] = new Question("", "", 4, 1, "");
		Bank[44] = new Question("", "", 4, 1, "");
		Bank[45] = new Question("What Continent are Penguins are found?", "", 4, 1, "Antarctica");
		Bank[46] = new Question("", "", 4, 1, "");
		Bank[47] = new Question("The world's largest mountain, Mt. Everest, is located on what Continent?", "", 4, 1, "Asia");
		Bank[48] = new Question("I am standing on the Great Wall of China. What Continent am I in?", "", 5, 1, "Asia");
		Bank[49] = new Question("Which Continent are in all four Hemispheres?", "", 5, 1, "Africa");
		Bank[50] = new Question("Humans were said to originate from what Continent?", "", 5, 1, "Africa");
		Bank[51] = new Question("Which Continent has the smallest Population?", "", 5, 1, "Antarctica");
		Bank[52] = new Question("Which Continent is the Great Barrier Reef in?", "", 5, 1, "Australia");
		Bank[53] = new Question("Both the Equator and the Prime Meridian run through which Continent?", "", 5, 1, "Africa");
		Bank[54] = new Question("Where is the Nile River, the world's largest river, located?", "", 5, 1, "Africa");
		Bank[55] = new Question("What Continent is the World's Largest Waterfall (Angel Falls) in?", "", 5, 1, "South America");
		Bank[56] = new Question("Which Ocean is almost entirely covered in ice year-round?", "", 5, 1, "Arctic Ocean");
		Bank[57] = new Question("", "", 5, 1, "");
		Bank[58] = new Question("", "", 5, 1, "");
		Bank[59] = new Question("", "", 5, 1, "");
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

		QuestionExecution: while (!doneYet) {
			secondNotDoneYet = false;
			int questionPicked = generator.nextInt(60);
			if (!Bank[questionPicked].isQuestionFinished()) {
				Bank[questionPicked].display();
				amountOfQuestions++;
				Bank[questionPicked].setQuestionFinished(true);
			} else if (amountOfQuestions == 60) {
				System.out
						.println("We ran out of questions, better luck next time");
				break QuestionExecution;
			} else {
				questionPicked = generator.nextInt();
				continue QuestionExecution;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			AnsweringQuestion: while (secondNotDoneYet == false /*&& ThreadThree.buttonState*/) {
				// TempOne = ThreadOne.in;
				// TempTwo = ThreadOne.out;
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
					System.out.println("You are Correct");
					count++;
					System.out.println("You have " + count + " Points");
					//System.out.println("before count check...");
					newTry = false;
					RFIDTracker = 5;
					//TryNumber = 0;
					// TempOne = "";
					// TempTwo = ""; 
					if (count == 20) {
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
					System.out
							.println("Nice Try, you were almost there. The correct answer was "
									+ Bank[questionPicked].getContinent());
					//Attempts = 0;
					newTry = false;
					ThreadOne.in = null;
					continue QuestionExecution;
				} else if (ThreadOne.in != null && ThreadThree.buttonState) {
					//System.out.println(TryNumber);
					System.out.println("Sorry, try again!!!");
					ThreadOne.in = null;
					newTry = true;
					continue AnsweringQuestion;
				}
			}

		}

		// This is all just necessary methods that need to be called
		System.out.println("end of everything...");

	}

}
