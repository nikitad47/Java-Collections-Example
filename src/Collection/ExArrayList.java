package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Employee
{
	int id;
	String Name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Employee(int id, String name)
	{
		this.id=id;
		Name=name;
	}
}

public class ExArrayList {

	//Comparable: Single sorting
	//Comparator: Multiple sorting
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();
		
		Employee emp = new Employee(1,"Abhay");
		Employee emp1 = new Employee(2,"Nikita");

		list.add(emp);
		list.add(emp1);
		
		for(int i=0;i<list.size();i++)
		{
		
		System.out.println(list.get(i).getName());
		System.out.println(list.get(i).getId());
		
		}

		
		
		
	}

}
