import java.lang.ArithmeticException;
public class exceptionhandling 
{
      public static void main(String args[])
      {
    	  try
    	  {
    		  int i=10;
    		  int j=0;
    		  int k=i/j;
    		  System.out.println("output is"+k);    	 
    	  }
    	  
      catch(ArithmeticException e)
      {
    	  System.out.println("Error ");
      }
     finally
     {
    	 System.out.println("Bye");
     }
}
}