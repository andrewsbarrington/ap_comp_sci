import java.util.Scanner;

public class adventure
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		step1();
		
		
	}
	public static void step1()
	{
		System.out.println("please choose a path, A, B, or C");
		String choice = kb.next();
		if (choice.equalsA or choice.equalsB or choice.equalsC);
		{
			System.out.println("you made it to another room");
			step2();
		}
		else if(choice.equals("B"))
		{
			System.out.println("youve stbbed your toe and died");
		
		}
		else if(choice.equalsC)
		{
			System.out.println("youve come to a deadend you must turn back");
			step1();
		}
		else{
			System.out.println(" please choose A, B, or C");
			step1();
		}
	}
	
	public static void step2()
	{
		System.out.println("you come to a room with three levers\n pick a lever" );
		int choice2 = kb.next();
		if (choice2 == 1)
		{
			System.out.println("a piano falls on your head and you die");
		}
		else if (choice == 2)
		{
			System.out.prinln("a door opens up and you go through");
		}
		else if (choice == 3)
		{
			System.out.println("poisen darts are shot from the wall and you secumb to the poison");
		}
		else{
			System.out.println("please choose 1,2,or3");
			step2();
		}
	}
	public static void step3()
	{
		System.out.println("you have three escape option, an uber car, dragon, or a broom stick");
		String choices = kb.next();
		if (choice.equalscar)
		{
			System.out.pringln("the car runs into a mote and you die");
		}
		else if (choice.equalsdragon)
		{
			System.out.println("you ride out on your dragon galiently, you have escaped");
		}
		else if (choice.equalsbroom)
		{
			System.out.println("the broom stick doesnt fly and you fall to your death");
		}
		else{
			System.out.println("please choose between car, dragon, or broom");
			step3();
		}
		
		
	}
}