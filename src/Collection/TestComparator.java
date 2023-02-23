 package Collection;

import java.util.*;

class Student
{
	int rollno;
	Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	String name;
	int age;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	
}

class NameComparator implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		return s1.name.compareTo(s2.name);
	}
}

class RollnoComparator implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		if(s1.rollno == s2.rollno)
		{
			return 0;
		}
		else if(s1.rollno > s2.rollno)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

class AgeComparator implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		if(s1.age == s2.age)
		{
			return 0;
		}
		else if(s1.age > s2.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

public class TestComparator {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(new Student(101,"Vijay",23));
		arr.add(new Student(102,"Ajay",27));
		arr.add(new Student(103,"Jay",21));
		
		System.out.println("Sorting by Name");
		Collections.sort(arr, new NameComparator());
		for(Student s:arr)
		{
			System.out.println(s.rollno + " " + s.name + " " + s.age);
		}
		
		System.out.println("\nSorting by RollNo");
		Collections.sort(arr, new RollnoComparator());
		for(Student s:arr)
		{
			System.out.println(s.rollno + " " + s.name + " " + s.age);
		}
		
		System.out.println("\nSorting by Age");
		Collections.sort(arr, new AgeComparator());
		for(Student s:arr)
		{
			System.out.println(s.rollno + " " + s.name + " " + s.age);
		}
		
	}

}
