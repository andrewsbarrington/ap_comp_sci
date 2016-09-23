import java.util.Scanner;


public class lab4_ex3

{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		lab4_ex3 interest = new lab4_ex3();
		
		System.out.println("what is your rate of interest");
		double r = kb.nextDouble();
		
		System.out.println("what is your principa");
		double p = kb.nextDouble();
		
		System.out.println("how many times is it compounded");
		double n = kb.nextDouble();
		
		System.out.println("how many years has the loan gone");
		double t = kb.nextDouble();
		
		double total = interest.calcint(p,r,n,t);
		
		System.out.printf("your total monthly payment is " + total);
		
	}
	
	public double calcint(double p, double r, double n, double t)
	{
		
		return (p*(Math.pow(1+(r/n), n*t)))/(t*12);
		
	}
	
	
	
	
	
	
	
	
	
}