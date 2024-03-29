public class BlackJackConsole {
	public BlackJackConsole() {
	System.out.println("Welcome to the BlackJack table. Let's play !");
	// This is an array of two cards
	Card[] tab = {new Card(Value.TWO, Color.HEART), new
	Card(Value.JACK,Color.SPADE)};
	for(Card c : tab) { // For each card
		System.out.println("This card is a "+c+ " worth "+c.getPoints()+ " points");
		System.out.print("It's a ");
		switch(c.getColorSymbole()) { // Ok from Java 1.7
			case "\u2665": System.out.print("heart"); break;
			case "\u2660": System.out.print("spade"); break;
			case "\u2663": System.out.print("club"); break;
			case "\u2666": System.out.print("diamond"); break;
			}
		if(c.getValueSymbole().matches("[JQK]")) { // Is the value symbol a J or a Q or a K ?
			System.out.println(" and a face !");
		} else {
			System.out.println(" and it's not a face.");
			}
		}
	}
	public static void main(String[] args) {
		new BlackJackConsole();
	}
}