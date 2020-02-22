package loop;

import java.util.Scanner;

public class Fact
{
  public void sum(int a)
  {
	    int i=a-1;
	    int c=a;
	  while(i>=1)
	  {
		  c=c*i;
		  i--;
		 
	  }
	  System.out.println("Factorial of" +c);
 
  }
  public static void main(String[] args) {
	Fact s=new Fact();
	Scanner s1=new Scanner(System.in);
	System.out.println("Please enetr number");
	int a=s1.nextInt();
	s.sum(a);
}
}
