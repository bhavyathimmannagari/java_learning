import java.util.Scanner;

public class switchstate
{
	public static void main(String[] args)
	{
       int a=20,b=5;
       int choice;
       Scanner n=new Scanner(System.in);
       System.out.println("enterr your choice from 1 to4");
       choice=n.nextInt();
       switch(choice)
       {
       case 1:
    	   System.out.println("addition of two numbers"+(a+b));
    	   break;
       case 2:
    	   System.out.println("substraction of two numbers"+(a-b));
    	   break;
       case 3:
    	   System.out.println("multiplication of two numbers"+(a*b));
    	   break;
       case 4:
    	   System.out.println("division of two numbers"+(a/b));
       default :
    	   System.out.println("invalid choice");
       }   
      }
       
}     
       

