package loop;

import java.util.Scanner;

public class Prime
{
	public void nm(int a)
	{
		int i=2;
		int j=0;
		while(i<a)
		{
			if(a%i==0)
			{
				j++;
				
				break;
			}
			else
			{
				i++;
			}
		}
			if(j==0) 
			{
				System.out.println("prime number "+ a);
			}
			else
			{
				System.out.println(" not prime number "+ a);
			}
			}
	
	
	

	public static void main(String[] args) 
	{
		Prime s=new Prime();
		Scanner s1=new Scanner(System.in);
		System.out.println("please enter number");
		int a= s1.nextInt();
		s.nm(a);

	}
}
