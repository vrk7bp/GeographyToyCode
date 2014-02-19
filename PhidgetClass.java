//Gautam

import com.phidgets.*;
import com.phidgets.event.*;

public class PhidgetClass{
	public static final void main(String args[]) throws Exception {
		RFIDPhidget rfid;
		System.out.println(Phidget.getLibraryVersion());

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
		rfid.addDetachListener(new DetachListener() {
			public void detached(DetachEvent ae) {
				System.out.println("detachment of " + ae);
			}
		});
		rfid.addErrorListener(new ErrorListener() {
			public void error(ErrorEvent ee) {
				System.out.println("error event for " + ee);
			}
		});
		rfid.addTagGainListener(new TagGainListener()
		{
			public void tagGained(TagGainEvent oe)
			{
				System.out.println(oe);
				int Points1 = 0;
				boolean done = false;
				while (!done){
					if(oe.toString().equals("PhidgetRFID v206 #104368 (attached) Tag Gained: 010693581c"))
					{
						int Points = 0;
						System.out.println("Sensor One");
						Points++;
						Points1 = Points1+Points;
						if(Points1<3)
						{
							System.out.println("Not Yet!!!");
						}
						else if (Points1==3)
						{
							done =true;
							System.out.println("Finsihed!!!!");
						}
					}
					else if (oe.toString().equals("PhidgetRFID v206 #104368 (attached) Tag Gained: 0107ee7861"))
					{
						int Points = 0;
						System.out.println("Sensor Two");
						Points--;
						Points1 = Points1+Points;
						if (Points1<3)
						{
							System.out.println("Finsihed!!!!");
						}
						else if (Points==3)
						{
							done = true;
							System.out.println("Not Yet!!!");
						}
					}
				}
			}
		});
		rfid.addTagLossListener(new TagLossListener()
		{
			public void tagLost(TagLossEvent oe)
			{
				System.out.println(oe);
			}
		});
		rfid.addOutputChangeListener(new OutputChangeListener()
		{
			public void outputChanged(OutputChangeEvent oe)
			{
				System.out.println(oe);
			}
		});
		
		rfid.openAny();
		System.out.println("waiting for RFID attachment...");
		rfid.waitForAttachment(1000);
		
		System.out.println("Serial: " + rfid.getSerialNumber());
		System.out.println("Outputs: " + rfid.getOutputCount());
		System.out.println("Outputting events.  Input to stop.");
		System.in.read();
		System.out.print("closing...");
		rfid.close();
		rfid = null;
		System.out.println(" ok");
		if (false) {
			System.out.println("wait for finalization...");
			System.gc();
		}
	}
}
