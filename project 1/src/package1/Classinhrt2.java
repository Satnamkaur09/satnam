package package1;

public class Classinhrt2 extends Classinhrt1
{
	public Classinhrt2()
	{
		this(1,2);
		System.out.println("Default child constructor");
	}

	public Classinhrt2(int a)
	{
		this();
		System.out.println("ONe parameter child constructor");
	}

	public Classinhrt2(int a,int b)
	{
		super(1,2);
		System.out.println("Two PArameter child constructor");
	}

	public Classinhrt2(int a,int b,int c)
	{
		this(1);
		System.out.println("Three parametr child constructor");
	}

   public static void main(String[] args) 
   
  {
	Classinhrt2 s = new Classinhrt2(1,2,3);
	
}
}
