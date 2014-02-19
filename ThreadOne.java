import java.io.IOException;

import com.phidgets.PhidgetException;
import com.phidgets.RFIDPhidget;
import com.phidgets.event.AttachEvent;
import com.phidgets.event.AttachListener;
import com.phidgets.event.TagGainEvent;
import com.phidgets.event.TagGainListener;
import com.phidgets.event.TagLossEvent;
import com.phidgets.event.TagLossListener;


public class ThreadOne extends Thread{
	static String in;
	static String out;

	public void run() {
		RFIDPhidget rfid = null;
		//System.out.println("Declaration");
			try {
				rfid = new RFIDPhidget();
			} catch (PhidgetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("Test");
			rfid.addAttachListener(new AttachListener() {
				public void attached(AttachEvent ae)
				{
					try
					{
						//System.out.println("in Attached Listener");
						((RFIDPhidget)ae.getSource()).setAntennaOn(true);
						((RFIDPhidget)ae.getSource()).setLEDOn(true);
					}
					catch (PhidgetException ex) { }
					//System.out.println("attachment of " + ae);
				}
			});
			rfid.addTagGainListener(new TagGainListener()
			{
				public void tagGained(TagGainEvent oe)
				{
					//System.out.println("Getting the Tag");
						in = oe.getValue();
					//System.out.println("Tag Gained " + in);
					//System.out.println(in);
				}
			});
			rfid.addTagLossListener(new TagLossListener()
			{
				public void tagLost(TagLossEvent oe)
				{
					//System.out.println(in);
					out = oe.getValue();
					//System.out.println("Tag Lost " + out);
					
				}
			});
			
			//System.out.println("Open");
			try {
				rfid.openAny();
			} catch (PhidgetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("Waiting");
			try {
				rfid.waitForAttachment(1000);
			} catch (PhidgetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("Trying to get inside");
			try {
				System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		
	}


