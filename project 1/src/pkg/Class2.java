package pkg;

// Program for (a+b)(a-b)

public class Class2 
{ 	int c;
   public int sum(int a , int b)
   {
   c =a+b;
   return c;
   }
   public int sub(int a , int b)
   {
	   c= a-b;
	   return c;
	  
   }
   public int mul (int a, int b)
   {
	   c=a*b;
	   return c;
	   
   }
   public static void main(String[] args) 
   {
	Class2 ref = new Class2();
	int m=ref.sum(10,2);
	int n = ref.sub(20, 5);
	int p= ref.mul(m, n);
	System.out.println("this is the result of program="+p);
			
   }
}
