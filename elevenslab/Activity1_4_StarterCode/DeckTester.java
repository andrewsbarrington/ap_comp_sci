/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		string[] ranks = { "two" , "three" ,"four","five","six","seven","eight","nine","ten","jack","queen","king","ace"};
		String[] suits = {"clubs","hearts","diamonds","spades"};
		int[] pointvalue = {2,3,4,5,6,7,8,9,10,10,10,10,11};
		string[] ranks1 = { "two" , "three" ,"four"};
		String[] suits1 = {"clubs","hearts","diamonds","spades"};
		int[] pointvalue1 = {2,3,4};
		string[] ranks2 = {"jack","queen","king","ace"};
		String[] suits2 = {"clubs","hearts","diamonds","spades"};
		int[] pointvalue2 = {,10,10,10,11};
		deck d = new deck(ranks , suits , pointvalue);
		deck d1 = new deck(ranks1,suits1,pointvalue1);
		deck d2 = new deck(ranks2,suits2,pointvalue2);
	}
}
