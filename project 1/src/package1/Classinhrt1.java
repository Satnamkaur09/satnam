package package1;

public class Classinhrt1

{
	public Classinhrt1()
	{
		this(1,2,3);
		System.out.println("Default parent constructor");
		
	}
	public Classinhrt1(int a)
	{
		this();
		System.out.println("one parameter parent constructor");
	}
	public Classinhrt1(int a,int b)
	{
		this(1);
		System.out.println("Two Parameter  parent constructor");
	}
	public Classinhrt1(int a,int b,int c)
	{
		System.out.println("three parameter parent constructor");
	}

}
