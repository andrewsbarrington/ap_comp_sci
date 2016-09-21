import java.util.Scanner;

public class APlab_4
{
	
	public static void main(String[]args)
	{
		APlab_4 xyz = new APlab_4();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("please enter item1:");
		String word1 = kb.nextLine();
		
		
		System.out.println("please enter the price:");
		double number1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("please enter item2:");
		String word2 = kb.nextLine();
	
		
		System.out.println("please enter the price:");
		double number2 = kb.nextDouble();
		
		kb.nextLine();
		System.out.println("please enter item3:");
		String word3 = kb.nextLine();
		
		System.out.println("please enter the price:");
		double number3 = kb.nextDouble();
		
		System.out.println("<<<<<<<<<<__receipt__>>>>>>>>>>>>");
		xyz.format(word1, number1);
		xyz.format(word2, number2);
		xyz.format(word3, number3);
		
		
		double subtotal = number1+number2+number3;
		
		
		
		
		double tax = .08*subtotal;
		
	
		
		
		double total = subtotal + tax;
		
		
		xyz.format("subtotal:", subtotal);
		xyz.format("tax:", tax);
		xyz.format("total:", total);
		
		System.out.println("\n______________________________________");
		
	}
	public void format(String word, double number)
	{
		
		System.out.printf("\n* %20s.......%20.2f", word, number);
		
		
	}

}