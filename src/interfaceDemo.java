
 interface inter
{
		public void ABC();
		default void show()
		{
			System.out.println("in show");
		}
}
class interface1 implements inter
{
	public void ABC()
	{
		System.out.println("In abc");
	}
}
public class interfaceDemo
{
	public static void main(String args[])
	{
	  inter obj=new interface1();
	  obj.show();
	  obj.ABC();
	}
}
	
		
	



	


