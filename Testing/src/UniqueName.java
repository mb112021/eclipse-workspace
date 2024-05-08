import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class UniqueName {
    public static void main(String[] args) throws IOException {
         List<Person1> people = Arrays.asList(new Person1 ("Jim", "Jones", "111"), 
                                             new Person1 ("Bob", "Smith", "222"), 
                                             new Person1 ("Dan", "Williams","333"), 
                                             new Person1 ("Jim","Jones", "222"), 
                                             new Person1 ("Jim","Jones", "333"), 
                                             new Person1 ("Dan", "Williams","111"), 
                                             new Person1 ("Jim","Jones", "222"), 
                                             new Person1 ("Jim","Jones", "111"), 
                                             new Person1 ("Bob", "Smith", "111"), 
                                             new Person1 ("Jim", "Jones","111"), 
                                             new Person1 ("Dan","Williams", "444"),
                                             new Person1 ("Dan","Williams", "555"));
        
         printUniqueNumbersPerName4(people);
         
         
     
    }
    
    public static void printUniqueNumbersPerName4(List<Person1> people) {
        
        Map<String,Integer> pMap = new HashMap<>();
        Map<String,Person1> personMap = new HashMap<>();
        
        for (Person1 person : people) {
            String key = person.name+person.lastName;
            if ( pMap.containsKey(key))
            {
                 
                    
            }
            else
            {
            	personMap.put(key,person);
   			 if ( pMap.containsKey(key))
                {
   				  //int count = pMap.get(key);
           		  //pMap.put(key, ++count);  
           		  pMap.compute(key, (x,y)->y+1);
           		  
                }
   			 else {
   				 pMap.put(key,1);
   			 }
            }
            
        }
        
        for (String key : pMap.keySet()) {
            
            System.out.println(key +": "+pMap.get(key));
            
        }
}
    
    public static void printUniqueNumbersPerName3(List<Person1> people) {
    	
    	// Map to store count of occurrences for each unique identifier
        Map<String, Integer> uniqueIdentifierCount = new HashMap<>();

        for (Person1 person : people) {
            String identifier = person.getIdentifier();
            uniqueIdentifierCount.put(identifier, uniqueIdentifierCount.getOrDefault(identifier, 0) + 1);
        }
        
        for (Map.Entry<String, Integer> entry : uniqueIdentifierCount.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Unique Count: " + entry.getValue());
        }
    	
    }

    public static void printUniqueNumbersPerName2(List<Person1> people) {
    	 Map<String,Integer> pMap = new HashMap<>();
    	 Map<Person1,String> personMap = new HashMap<>();
    	 
    	for (Person1 person : people) {
    		 String key = person.name+" "+person.lastName;
    		 if( personMap.containsKey(person)) {
    		 
    		 }
    		 else
    		 {
    			 personMap.put(person, "");
    			 if ( pMap.containsKey(key))
                 {
    				  //int count = pMap.get(key);
            		  //pMap.put(key, ++count);  
            		  pMap.compute(key, (x,y)->y+1);
            		  
                 }
    			 else {
    				 pMap.put(key,1);
    			 }
    		 }
    		
    	}
    	
    	System.out.println(personMap.size());
    	
    	  for (String key : pMap.keySet()) {
              
              System.out.println(key +": "+pMap.get(key));
              
          } 
    	
    }
 
    public static void printUniqueNumbersPerName1(List<Person1> people) {
        
        Map<String,Integer> pMap = new HashMap<>();
        Set<Person1 > personSet = new HashSet<>();
        
        for (Person1 person : people) {
    
            
            personSet.add(person);
           
        }
        
        for (Iterator iterator = personSet.iterator(); iterator.hasNext();) {
			Person1 person1 = (Person1) iterator.next();
			
			 String key = person1.name +" "+ person1.lastName;
	            	  if ( pMap.containsKey(key))
	                  {
	            		  int count = pMap.get(key);
	            		  pMap.put(key, ++count);  
	                  }
	            	  else
	                  {
	                       pMap.put(key,1);
	                  }  
			
		}
        System.out.println(personSet.size());
        
        for (String key : pMap.keySet()) {
            
            System.out.println(key +": "+pMap.get(key));
            
        } 
    	
    	 

    }
}

class Person1 {
    public String name;
    public String lastName;
    public String phone; 
    
    public Person1(String name, String lastName, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getIdentifier() {
        return name + " " + lastName;
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person1 other = (Person1) obj;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
	 	if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false; 
		return true;
	}
    
    
}

