package package1;

public class Classinhert1 
{
	public void m1()
	
	{
		System.out.println("Default parent method ");
		
	}
	public void m2(int a)
	{
		this.m4(1, 2, 3);
		this.m1();
		this.m3(1, 2);
				System.out.println("one parameter parent method ");
	}
	public  void m3(int a,int b)
	{
				System.out.println("Two Parameter parent method ");
	}
	public  void m4(int a,int b,int c)
	{
		System.out.println("three parameter parent method ");
	}


}
