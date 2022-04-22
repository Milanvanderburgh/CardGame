package CardGame;

import java.util.*;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<>();

	public Deck() {

		for (int i = 0; i < 4; i++) {

			String suit = null;

			switch (i) {

			case 0:
				suit = "heart";
				break;

			case 1:
				suit = "clubs";
				break;

			case 2:
				suit = "spades";
				break;

			case 3:
				suit = "diamonds";
				break;
			}

			for (int j = 2; j <= 10; j++) {
				Card c = new Card(suit, suit + " of " + j, j);
				cards.add(c);
			}

			Card jack = new Card(suit, suit + " jack " + " of " + 10, 10);
			Card queen = new Card(suit, suit + " queen " + " of " + 10, 10);
			Card king = new Card(suit, suit + " king " + " of " + 10, 10);
			Card ace = new Card(suit, suit + " ace " + " of " + 11, 11);

			cards.add(jack);
			cards.add(queen);
			cards.add(king);
			cards.add(ace);

		}

		Collections.shuffle(cards);

	}

	public Card getNextCard() {
		int next = 0;
		Card nextCard = cards.remove(next);
		// System.out.println("your card is" + cards.remove(next));
		return nextCard;

	}

	public ArrayList<Card> getCards() {
		return cards;
	}

}