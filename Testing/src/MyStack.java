
public class MyStack {
	
	int[]  stack;
	int maxSzie;
	int top ;
	public MyStack(int maxSzie) {
		 
		this.maxSzie = maxSzie;
		
		stack = new int[maxSzie];
		
		top = -1;
	}
	
	public void push(int value)
	{
		if ( isFull())
		{
			System.out.println("Stack full");
			return;
		}
		stack[++top] = value;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack empty");
			return -1;
		}
		return stack[top--];
	}
	
	public int peek()
	{
		return stack[top];
	}
	
	public boolean isEmpty() {
		return ( top==-1);
	}
	
	public boolean isFull() {
		return ( top==maxSzie-1);
	}
	
	

}
