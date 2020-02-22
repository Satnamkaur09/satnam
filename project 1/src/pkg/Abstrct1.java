package pkg;

public class Abstrct1 extends Abstrct
{
    public void arith()
    {
    	System.out.println(" This is child class and provide body to parents class method ");
    }
    public static void main(String[] args) 
    {
	  Abstrct1 s= new Abstrct1();
	  s.display();
	 s.arith();
	}
}
