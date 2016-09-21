public class lesson_4

{
	public static void main(String[]args)
	{
		
		lesson_4 form = new lesson_4();
		
		
		String word1 = "blaaah";
		
		double number1 = 456.43;
		
		form.format(word1, number1);
		String word2 = "yesssss";
		double number2 = 23048.234;
		form.format(word2, number2);
	}
	
	public void format(String word, double number)
	{
		
		System.out.printf("\n%10s  %10.2f", word , number);
		
		
	}
	
}