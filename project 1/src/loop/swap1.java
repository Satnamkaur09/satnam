package loop;

import java.util.Scanner;

public class swap1
{
   public void ab(int a,int b)
   {
	   if((a<=0)&&(b<=0))
	   {
		  System.out.println("pLease enter positive number");
	   }
	   else
	   {
		   b=a+b;
		   a=b-a;
		   b=b-a;
		   System.out.println("value of a" + a );
		   System.out.println("value of b " +b );
	   }
   }
   @SuppressWarnings("resource")
public static void main(String[] args)
   {
	swap1 s=new swap1();
	Scanner s1=new Scanner(System.in);
	System.out.println("Please enetr value of a");
	int a=s1.nextInt();
	System.out.println("Plesae enetr value of B");
	int b = s1.nextInt();
	s.ab(a, b);
}
}
