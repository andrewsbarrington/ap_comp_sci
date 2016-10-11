import java.util.Scanner;

public class ex2
{
	
	public static void main(String[]args)
	{
		ex2 xyz = new ex2();
		
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
		kb.nextLine();
		System.out.println("please enter item4");
		String word4 = kb.nextLine();
		
		
		System.out.println("please enter the price");
		double number4 = kb.nextDouble();
	
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<__receipt__>>>>>>>>>>>>>>>>>>>>>>");
		xyz.format(word1, number1);
		xyz.format(word2, number2);
		xyz.format(word3, number3);
		xyz.format(word4, number4);
		
		double subtotal = number1+number2+number3+number4;
		double disc = discount(subtotal);
		double tax = .08*disc;
		double total = subtotal + tax;
		
		xyz.format("subtotal", subtotal);
		xyz.format("discount", disc);
		
	xyz.format("tax", tax);
		
		xyz.format("total", total);
		
		System.out.println("\n___________________________________________________");
		System.out.println("* thank you for your service *");
	}
	public static double discount(double subtotal)
	{
		double act = 0;
		if(subtotal<2000)
		{	act = subtotal;
		
		}
		if (subtotal>2000)
		{act = (subtotal*.15);
	
		}
	return act;
		
	}
	
	
	public void format(String word, double number)
	{
		
		System.out.printf("\n* %20s.......%20.2f", word, number);
		
		
	}

}