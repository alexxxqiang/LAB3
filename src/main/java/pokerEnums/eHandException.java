
package pokerEnums;

public enum eHandException {
	ShortHand(){
		public String toString(){
			return "Hand is short a card.";
		}
	},
	TiedHands(){
		public String toString(){
			return "Top two hands are tied.";
		}
	}
}