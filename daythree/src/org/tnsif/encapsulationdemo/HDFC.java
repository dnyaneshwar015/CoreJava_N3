package org.tnsif.encapsulationdemo;

public class HDFC {
	private int Pin;
	void accept()
	{
		System.out.println("The ATM pin is: "+Pin);
		}
	public int getPin() {
		return Pin;
	}
	public void setPin(int pin) {
		Pin = pin;
	}


		}
