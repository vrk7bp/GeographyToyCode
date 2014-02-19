/*
 * Copyright 2007 Phidgets Inc.  All rights reserved.
 */

import com.phidgets.*;
import com.phidgets.event.*;

public class ThreadThree extends Thread
{
	static boolean buttonState = false;
	@Override
	public void run() {
		
		InterfaceKitPhidget ik = null;
		//System.out.println("Declaring Three");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}

		//Example of enabling logging.
		//Phidget.enableLogging(Phidget.PHIDGET_LOG_VERBOSE, null);

		//System.out.println(Phidget.getLibraryVersion());

		try {
			ik = new InterfaceKitPhidget();
			//System.out.println("Test Three");
		} catch (PhidgetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ik.addAttachListener(new AttachListener() {
			public void attached(AttachEvent ae3) {
				//System.out.println("attachment of " + ae);
			}
		});
		ik.addDetachListener(new DetachListener() {
			public void detached(DetachEvent ae3) {
				//System.out.println("detachment of " + ae);
			}
		});
		ik.addErrorListener(new ErrorListener() {
			public void error(ErrorEvent ee3) {
				//System.out.println(ee);
			}
		});
		ik.addInputChangeListener(new InputChangeListener() {
			public void inputChanged(InputChangeEvent oe3) {
				buttonState = oe3.getState();
				//System.out.println(oe);
				System.out.println(buttonState);
			}
		});
		ik.addOutputChangeListener(new OutputChangeListener() {
			public void outputChanged(OutputChangeEvent oe3) {
				//System.out.println(oe);
			}
		});
		ik.addSensorChangeListener(new SensorChangeListener() {
			public void sensorChanged(SensorChangeEvent se3) {
				//System.out.println(se);
			}
		});

		//System.out.println("Opening Three");
		try {
			ik.openAny();
		} catch (PhidgetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//System.out.println("waiting for InterfaceKit attachment...");
		//System.out.println("Waiting Three");
		try {
			ik.waitForAttachment();
		} catch (PhidgetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		//System.out.println(ik.getDeviceName());
		//System.out.println("Sleeping Three");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		if (false) {
			System.out.print("closing...");
			System.out.flush();
			//ik.close();
			System.out.println(" ok");
			System.out.print("opening...");
			try {
				ik.openAny();
			} catch (PhidgetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" ok");
			try {
				ik.waitForAttachment();
			} catch (PhidgetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			if (ik.getInputCount() > 8)
				System.out.println("input(7,8) = (" +
				  ik.getInputState(7) + "," +
				  ik.getInputState(8) + ")");
		} catch (PhidgetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (false) {
			System.out.print("turn on outputs (slowly)...");
			try {
				for (int i = 0; i < ik.getOutputCount() ; i++) {
					ik.setOutputState(i, true);
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
			} catch (PhidgetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" ok");
		}

		if (false)
			for (;;) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		for (int j = 0; j < 1000 ; j++) {
			try {
				for (int i = 0; i < ik.getOutputCount(); i++) {
					ik.setOutputState(i, true);
				}
			} catch (PhidgetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				for (int i = 0; i < ik.getOutputCount(); i++)
					ik.setOutputState(i, false);
			} catch (PhidgetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (false) {
			System.out.println("toggling outputs like crazy");
			boolean o[];
			try {
				o = new boolean[ik.getOutputCount()];
			} catch (PhidgetException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				for (int i = 0; i < ik.getOutputCount(); i++)
					try {
						o[i] = ik.getOutputState(i);
					} catch (PhidgetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			} catch (PhidgetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < 100000; i++) {
				int n;
				try {
					n = (int)(Math.random() * ik.getOutputCount());
				} catch (PhidgetException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					ik.setOutputState(n, !o[n]);
				} catch (PhidgetException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("setOutputState " + n +
				  ": " + !o[n]);
				o[n] = !o[n];
				try {
					Thread.sleep(1);
				} catch (Exception e) {
				}
			}
		}

		//System.out.println("Outputting events for 30 seconds.");
		try {
			Thread.sleep(100000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.print("closing...");
		//ik.close();
		//ik = null;
		System.out.println(" ok");
		if (false) {
			System.out.println("wait for finalization...");
			System.gc();
		}
	}
}