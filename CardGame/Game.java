package CardGame;

import java.util.Scanner;

public class Game {
	
	private static int score;
	private static Card currentCard;
	private static Card nextCard;
	private static Deck deck;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		deck = new Deck();

		System.out.println(currentCard = deck.getNextCard());
		gameTurn();
		
	}
	
	
 public static void gameTurn() {
	System.out.println("Higher or Lower");
	
	String answer = sc.nextLine();
	
	System.out.println("");

	
	System.out.println(nextCard = deck.getNextCard()); 
	
	if(answer.equals("higher") && nextCard.isHigherOrEqual(currentCard)) {
		correct();
	}else if(answer.equals("lower") && !nextCard.isHigherOrEqual(currentCard)) {
		correct();
	}else {
		gameOver();
	}
	
}
 
 
 public static void correct() {
	 score++;
	 System.out.println("Your score is now:" + score);
	 currentCard = nextCard;
	 gameTurn();
 }

 public static void gameOver() {
	 System.out.println("Game Over");
	 System.out.println("Your Score Was:" + score);
 }
 
	
}
