import java.util.*;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> mySet = new HashSet<>();
		
		mySet.add("Manju");
		mySet.add("apple");
        mySet.add("banana");
        mySet.add("orange");
        mySet.add("apple"); 
        
        
        System.out.println(mySet);;
        
        for(String s : mySet) {
        	System.out.println(s);
        }
        
        System.out.println(mySet.size());
        
        
        
        ///
        
		

	}

}

