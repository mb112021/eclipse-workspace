public class LinkedList<Node> {
    
	Node head;
	
    public void add (Node t){
    
    	if(head == null)
    		head = t;
    	else
    	{
    		Node last = head;
    		
    		while(last.next !=null)
    		{
    			last = last.next;
    		}
    		
    		last.next = t;
    	}
    	
    	
    }
    
    public int get(int index) {
        if (head == null || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            current = current.next;
            count++;
        }
        throw new IndexOutOfBoundsException("Index out of bounds");
    }
    
    public  int getCountRec(Node node)
    {
        // Base case
        if (node == null)
            return 0;
 
        // Count is this node plus rest of the list
        return 1 + getCountRec(node.next);
    }
 
    /* Wrapper over getCountRec() */
    public int getCount() { return getCountRec(head); }
   
    public void remove(Node t) {
    	
    	if(t == null || head == null)
    		return;
    	
    	if(t.equals(head))
    		head = head.next;
    	 Node current  = head;
    	 while(current.next !=null)
 		{
    		 current = current.next;
 		}
    	 
    	 
     
    }

    public boolean contains(Node t) {
        return false;
    }
    
    
    public static void main(String args[])
    {
    	LinkedList l = new LinkedList<>();
    	
    	l.add(new Node(10));
    	l.add(new Node(9));
    	
    	System.out.println(l.getCount());
    }
    
   
 static   class Node {
    	
    	Node next;
    	int data;
    	
    	public Node (int data) {
    		this.data = data;
    	}
    	
    }
}

