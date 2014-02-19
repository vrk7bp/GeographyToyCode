
import com.phidgets.*;
import com.phidgets.event.*;

public class HopeThisWorks {
	static String Tester;
	
	public static void main(String args[]) {
		Tester = ReferenceClass.s;
		if(Tester.equals("010693581c")){
			System.out.println("Got'em");
		}
	}
	

}
