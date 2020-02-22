package loop;

import java.util.Scanner;

public class table 
{
int i;

public void tab(int a)
{
	int b;
	b=a;
	System.out.println("Table of "+ a);
	for(int i=1;i<=10;i++)
	{
		
	  System.out.println(b);
	  b=b+a;
	}
	}
public static void main(String[] args) {
	table s=new table();
	Scanner s1=new Scanner(System.in);
	System.out.println("please enter table no");
	int a= s1.nextInt();
	s.tab(a);
}


}
