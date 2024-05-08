
public class TestPBR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer a = new Integer(10);
		
		ab a = new ab();
		a.a=10;
		int b = addnumber(a);
		
		System.out.println(a.a +"\n"+ b);
	}

	/*static int addnumber(int a)
	{
		a+=1;
		
		return a;
	}*/
	
	static int addnumber(ab a)
	{
		ab.a+=1;
		
		return ab.a;
	}
	
	
	static class ab {
		static int a ;
	}
}
