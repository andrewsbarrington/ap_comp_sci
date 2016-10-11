import java.util.Scanner;

public class GPA
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("what is your math grade");
		String grade1 = kb.next();
		System.out.println("what is your science grade");
		String grade2 = kb.next();
		System.out.println("what is your english grade");
		String grade3 = kb.next();
		System.out.println("what is your compsci grade");
		String grade4 = kb.next();
		System.out.println("what is your history grade");
		String grade5 = kb.next();
		System.out.println("what is your cooking grade");
		String grade6 = kb.next();
		System.out.println("what is your spanish grade");
		String grade7 = kb.next();
		
		//uno = calc(grade1);
		//dos = calc(grade2);
		//tres = calc(grade3);
		//quatro = calc(grade4);
		//cinco = calc(grade5);
		//ses = calc(grade6);
		//siete = calc(grade7);
		
		double total = (calc(grade1) + calc(grade2) + calc(grade4) + calc(grade4) + calc(grade5)+ calc(grade6)+ calc(grade7))/7;
		
		System.out.printf("your gpa is %10.2f" , total);
		
		
		
	}
	public static double calc(String grade)
	{
		
		 
		if (grade.equals("A"))
		{return 4.0;}
		if (grade.equals("b"))
		{return 3.0;}
		if (grade.equals("c"))
		{return 2.0;}
	if (grade.equals("d"))
	{return 1.0;}
else
{return 0;}

	}
}