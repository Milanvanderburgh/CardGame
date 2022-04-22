package CardGame;

public class Card {

private String suit;
public String name;
public int value;



public Card (String suit, String name, int value ) {
	this.suit = suit;
	this.name = name;
	this.value = value;
}

public String toString () {
	return name;
	
}

public boolean isHigherOrEqual (Card c) {
	if(value >= c.value || value == c.value) {
		return true;
	}
	return false;
	
}
	
	public int getValue() {
		return value;
	}
	
	public String getSuit() {
		return suit;
	}

}


