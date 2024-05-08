import java.util.*;

public class TestSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Person> pset = new HashSet<>();
		
		Person p1 = new Person("Manju", 1234);
		pset.add(p1);
		Person p2 = new Person("Manju", 1234);
		pset.add(p2);
		Person p3 = new Person("Manju", 1234);
		pset.add(p3);
		
		Person p4 = new Person("Manju", 1234);
		pset.add(p4);
		
		System.out.println(pset.size());
		
		
		

	}

}
class Person{
	String Name;
	int number;
	public Person(String name, int number) {
		super();
		Name = name;
		this.number = number;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + number;
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
		Person other = (Person) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	/*public int compareTo(String anotherString) {
		return Name.compareTo(anotherString);
	}*/
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", number=" + number + "]";
	}
	
	
	
	
}