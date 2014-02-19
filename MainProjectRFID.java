import java.util.Scanner;

import com.phidgets.*;
import com.phidgets.event.*;

public class MainProjectRFID {
	static String in;
	static String out;
	public static void main(String args[]) throws Exception {
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
				System.out.println("attachment of " + ae);
			}
		});
		rfid.addTagGainListener(new TagGainListener()
		{
			public void tagGained(TagGainEvent oe)
			{
				in = oe.getValue();
				System.out.println(in);
			}
		});
		rfid.addTagLossListener(new TagLossListener()
		{
			public void tagLost(TagLossEvent oe)
			{
				out = oe.getValue();
			}
		});
		
		rfid.openAny();
		rfid.waitForAttachment(1000);
		System.in.read();
	}

}
