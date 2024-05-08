import java.util.*;

public class TreemapExample {

	 public static void main(String[] args) {
	        // Define a custom comparator for sorting the map by length of the keys
	        Comparator<String> customComparator = Comparator.comparing(String::length);

	        // Create a TreeMap with the custom comparator
	        Map<String, Integer> customSortedMap = new TreeMap<>();

	        // Add elements to the map
	        customSortedMap.put("apple", 1);
	        customSortedMap.put("banana", 2);
	        customSortedMap.put("orange", 3);
	        customSortedMap.put("grape", 4);
	        customSortedMap.put("kiwi", 5);

	        // Display the elements of the sorted map
	        for (Map.Entry<String, Integer> entry : customSortedMap.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }

}
