package pkg;

public class Multi_level_child  implements Multi_levl_intrfc
{
	static int c;
  public void arith(int a,int b)
  {
	   c= a+b;
	  System.out.println("sum is" +c);
	  c= c-a;
	  System.out.println("subtraction is "+c);
  }
  public void message()
  {
	  System.out.println("THIS IS THE EXAMPLE OF MULTI LEVEL ABSTARCTION AND STATIC VARIABLE");
  }
  public static void main(String[] args) {
	  Multi_level_child sat= new Multi_level_child();
	  sat.message();
	  sat.arith(15, 20);
	  
}
}
