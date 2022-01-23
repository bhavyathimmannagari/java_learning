
  class object
{
   int num1;
   int num2;
   int result;
   public void demo()
   {
	   result=num1+num2;
   }
}
public class objectdemo
{
	public static void main(String args[])
	{
		object ob=new object();
		ob.num1=10;
		ob.num2=20;
		ob.demo();
		System.out.println("result is"+ob.result);
	}
	
}
