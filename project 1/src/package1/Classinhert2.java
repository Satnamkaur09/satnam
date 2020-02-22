package package1;

public class Classinhert2 extends Classinhert1

{ 
	public void n ()
	{
	 System.out.println("default child method");	
	}
  public void n1(int a)
  {
	  
	  System.out.println("one parameter child method");
  }
  public void n2(int a, int b)
  {
	  System.out.println("two parameter child method");
  }
  public void n3(int a, int b, int c)
  {
	  super.m2(1);
	  System.out.println("three parameter child method");
	  this.n();
	  this.n2(1, 2);
	  this.n1(1);
  }
  public static void main(String[] args) 
  {
	Classinhert2 s= new Classinhert2();
	s.n3(1,2,3);
	
}
}

