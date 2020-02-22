package pkg;

public class Intrfac3 implements Intrfac
{
	public void arith(int a, int b)
	{
		int c= a*b;
		System.out.println("multiple result is" + c);
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to all in interfAC ");
		Intrfac3 a= new Intrfac3();
		a.arith(12,13);
		Intrfac2 b= new Intrfac2();
		b.arith(22,10);
		Intrfc1 c= new Intrfc1();
		c.arith(12,13);
	}
}

