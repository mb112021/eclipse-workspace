import java.net.HttpURLConnection;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ints = {-1,-2};
		List<Integer> intList = new ArrayList<Integer>(ints.length);
		for (int i : ints)
		{
		    intList.add(i);
		}
		boolean found = false;
		int i = 0;
		while(!found)
		{
			i++;
			int ind = intList.indexOf(i);
			if(ind == -1)
				found = true;
		
		}
		
		System.out.println(i);
		
		int a =1;
		int b = a++;
		int c = ++b;
		
		System.out.println(a + " "+b+" "+ c);
		
		int d = 1<<2;
		
		System.out.println(d);
		
		System.out.println( " ");
		
		char ss = 0x20;
		int nn = 1;
		System.out.println(ss+nn+"=A");
		System.out.println(Byte.MAX_VALUE);
		
		for (byte j= Byte.MIN_VALUE  ; j < Byte.MAX_VALUE; j++) {
			if ( j==0x90)
			{
				System.out.println("we fouund");
			}
			
		}
		
		
		/*HashMap<Integer, String > mymap = new HashMap<Integer, String>(5);
		mymap.put(1, "apple");
		mymap.put(2, null);
		mymap.put(new Integer(3), "peach");
		mymap.put(3, "orange");
		mymap.put(4, "peach");
		
		for (String v : mymap.values()) {
			if( "orange".equals(v)) {
				mymap.put(5, "orange");
			}
			
		}
		System.out.println(mymap.get(5));*/
		
		final List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1,5,2,3,7,3,8,9);
		final Integer post = Integer.valueOf(3);
		list.remove(post);
		System.out.println(list);
		
		//System.out.println(HttpURLConnection.HTTP_N);
	}

}
