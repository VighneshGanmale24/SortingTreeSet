package sortedTreeSet;

public class Student {
	
	String name ;
	int id;
	String village;
	
	
	public Student() {
		super();
	}


	public Student(String name, int id, String village) {
		super();
		this.name = name;
		this.id = id;
		this.village = village;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", village=" + village + "]";
	}
	
	

}
