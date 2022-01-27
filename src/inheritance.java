class Calculator
{
	public int add(int i,int j)
	{
		return i+j;
	}
}
class Caladvan extends Calculator
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}
public class inheritance
{

	public static void main(String[] args) 
	{
		Caladvan r1=new Caladvan();
		System.out.println(r1.add(4, 5));
		System.out.println(r1.sub(7,3));
		

	}

}
