import java.util.Random;


public class MainTest {
	
	static String Inter;
	static Random generator = new Random();
	
	public static void main(String args[]){
		/*Question[] Bank = new Question[10];
		Bank[0] = new Question("This is the first question", "010693581c", 1, 1);
		Bank[1] = new Question("This is the second question", "010693581c", 1, 1);
		Bank[2] = new Question("This is the third question", "010693581c", 1, 1);
		Bank[3] = new Question("This is the fourth question", "010693581c", 1, 1);
		Bank[4] = new Question("This is the fifth question", "010693581c", 1, 1);
		Bank[5] = new Question("This is the sixth question", "010693581c", 1, 1);
		Bank[6] = new Question("This is the seventh question", "010693581c", 1, 1);
		Bank[7] = new Question("This is the eighth question", "010693581c", 1, 1);
		Bank[8] = new Question("This is the ninth question", "010693581c", 1, 1);
		Bank[9] = new Question("This is the tenth question", "010693581c", 1, 1);
		int questionPicked = generator.nextInt(10);		//Picks a random number from 0 to 59*/

		ThreadOne FirstThread = new ThreadOne();
		ThreadTwoTestTwo SecondThread = new ThreadTwoTestTwo();
		ThreadThree ThirdThread = new ThreadThree();
		DriverProject Frame = new DriverProject();
		DriverProjectTwo FrameTwo = new DriverProjectTwo();
		//System.out.println("before first thread...");
		SecondThread.start();
		//System.out.println("after first thread...");
		FirstThread.start();
		//System.out.println("after second thread...");
		ThirdThread.start();
		//System.out.println("after third thread");
		Frame.start();
		FrameTwo.start();
		//Frame.start();
	}

}
