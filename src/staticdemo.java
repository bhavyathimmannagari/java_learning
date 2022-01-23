class Emp
{
	int eid;
	int salary;
	static String ceo;
	public void Emp()
	{
		eid=10;
		salary=2000;
	}
	static
	{
		ceo="larry";
	}
	public void show()
	{
		System.out.println(eid+":"+salary+":"+ceo);
	}
	
}
public class staticdemo 
{
    public static void main(String[] args) 
    {
    	Emp bhavya=new Emp();
    	bhavya.Emp();
    	bhavya.show();
    	Emp divya=new Emp();
    	divya.Emp();
    	divya.show();
    	
    }
}


