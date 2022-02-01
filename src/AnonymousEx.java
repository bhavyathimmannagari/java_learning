class Ab
{
	public void show()
	{
		System.out.println("In show");
	}
}
public class AnonymousEx 
{

	public static void main(String[] args)
	{
		Ab obj=new Ab()
				{
			       public void show()
			       {
			    	   System.out.println("I am the best");
			       }
		
				};
				obj.show();
	}
	
}
