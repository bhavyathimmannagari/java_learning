interface ABC
{
	void show();
	
}
public class InterfaceDemo1
{

	public static void main(String[] args)
	{
		ABC obj=new ABC()
				{
			       public void show()
			       {
			    	   System.out.println("I am the best");
			       }
				};
		obj.show();
            
	}

}
