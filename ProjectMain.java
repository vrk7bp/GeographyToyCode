import java.io.IOException;

import com.phidgets.*;
import com.phidgets.event.*;

public class ProjectMain {
	public static void main(String[] args) throws PhidgetException, IOException{
	
		Question[] questions = new Question[2];
		questions[0] = new Question("This is a Test","123456",1,1, "");
		PointCounter Game = new PointCounter(questions);
		Game.checkAnswer("010693581c");
		
	}
}