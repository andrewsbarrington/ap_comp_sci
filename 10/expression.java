import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class expression
{ 

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter an equation");
		String expression = kb.nextLine();
		
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		int i = 0;
		
		doEquation(equation);
	}
	public static void doEquation(ArrayList<String> equation)
	{
		int i = 0;
		while(i<equation.size())
		{
			if(equation.get(i).equals("*") || equation.get(i).equals("/"))
			{
				if(equation.get(i).equals("*"))
				{
					equation.set(i, " " + (Integer.parseInt(equation.get(i-1)) * Integer.parseInt(equation.get(i+1))));
				}
				else
				{
					equation.set(i, " " + (Integer.parseInt(equation.get(i-1)) / Integer.parseInt(equation.get(i+1))));
				}
				equation.remove(i-1);
				equation.remove(i);
			}
			i++;	
		}
		i = 0;
		while(i<equation.size())
		{
			if(equation.get(i).equals("+") || equation.get(i).equals("-"))
			{
				if(equation.get(i).equals("+"))
				{
					equation.set(i, " " + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
				}
				else
				{
					equation.set(i, " " + (Integer.parseInt(equation.get(i-1)) - Integer.parseInt(equation.get(i+1))));
				}
				equation.remove(i-1);
				equation.remove(i);
			}
			i++;	
		}
		System.out.print(equation);
	}
}