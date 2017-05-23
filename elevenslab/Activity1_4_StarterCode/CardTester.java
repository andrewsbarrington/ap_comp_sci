/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		card kingOfHearts = new card("king","hearts",13);
		card queenOfSpades = new card("Queen","Spades",12);
		card aceOfSpades = new("ace","Spades",1);
		System.out.prinln(kingOfHearts.toString());
		System.out.println(kingOfHearts.matches(aceOfSpades));
	}
}
