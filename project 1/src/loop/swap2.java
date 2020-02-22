package loop;

import java.util.Scanner;

public class swap2
{
	public void sum(int a, int b)
	{
		int c= a;
		a=b;
		b=c;
		 System.out.println("value of a" + a );
		   System.out.println("value of b " +b );
	}
public static void main(String[] args) {
	swap2 s= new swap2();
	Scanner s1= new Scanner(System.in);
	System.out.println("Please enetr value of a");
	int a=s1.nextInt();
	System.out.println("Plesae enetr value of B");
	int b = s1.nextInt();
	s.sum(a, b);
}
}
