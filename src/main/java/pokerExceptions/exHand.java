
package pokerExceptions;

import pokerBase.Hand;

public class exHand extends Exception{
	private Hand h;
	
	public exHand(String message,Hand h){
		super(message);
		this.h = h;
	}
}