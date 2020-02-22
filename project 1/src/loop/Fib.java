package loop;

import java.util.Scanner;

public class Fib 
{
 int a=0;
 int b=1;
 int i;
 public void sum(int s)
 {
	 for(int i=0;i<=s;i++)
	 {
		 int c=a+b;
		 System.out.println(c);
		 a=b;
		 b=c;
	 }
 }
 public static void main(String[] args) {
    Fib s2=new Fib();
	Scanner s1=new Scanner(System.in);
    System.out.println("Please range of Fibacci series");
    int s=s1.nextInt();
    s2.sum(s);
}
		 
}
