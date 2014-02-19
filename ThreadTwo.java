import java.util.Random;

public class ThreadTwo extends Thread {
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

	public ThreadTwo() {
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
		Question[] Bank = new Question[10];
		Bank[0] = new Question("This is the first question", "010693581c", 1,
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
				1, "South America");
		/*
		 * if (ThreadOne.in != null) { System.out.println("T2:" + ThreadOne.in);
		 * } try { Thread.sleep(10000); } catch (InterruptedException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */
		// String TempOne;
		// String TempTwo;

		QuestionExecution: while (!doneYet) {
			secondNotDoneYet = false;
			int questionPicked = generator.nextInt(10);
			if (!Bank[questionPicked].isQuestionFinished()) {
				Bank[questionPicked].display();
				amountOfQuestions++;
				Bank[questionPicked].setQuestionFinished(true);
			} else if (amountOfQuestions == 10) {
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
			AnsweringQuestion: while (secondNotDoneYet == false) {
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
						/* && Bank[questionPicked].getRFIDTag().equals(TempTwo) */&& ThreadOne.in != null /*&& ThreadThree.buttonState*/) {
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
					if (count == 10) {
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
				} else if (ThreadOne.in != null && TryNumber == 1 /*&& ThreadThree.buttonState*/) {
					System.out
							.println("Nice Try, you were almost there. The correct answer was "
									+ Bank[questionPicked].getContinent());
					//Attempts = 0;
					newTry = false;
					ThreadOne.in = null;
					continue QuestionExecution;
				} else if (ThreadOne.in != null) {
					//System.out.println(TryNumber);
					System.out.println("Sorry, try again!!!");
					ThreadOne.in = null;
					newTry = true;
					continue AnsweringQuestion;
				}
			}

		}

		// This is all just necessary methods that need to be called
		System.out.println("The Game is Finished, we hope that you enjoyed it.");

	}

}
