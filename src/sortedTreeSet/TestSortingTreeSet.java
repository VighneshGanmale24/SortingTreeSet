package sortedTreeSet;

import java.util.TreeSet;

public class TestSortingTreeSet {

	
	public static void main(String[] args) {
		
		
		StudentNameComparator studentSortByName = new StudentNameComparator();
		StudentVillageComparator studentSortByVillage= new StudentVillageComparator();
		StudentIdComparator studentSortById = new StudentIdComparator();
		
		TreeSet<Student> treeSet1 = new TreeSet<Student>(studentSortByName);
		TreeSet<Student> treeSet2 = new TreeSet<Student>(studentSortByVillage);
		TreeSet<Student> treeSet3 = new TreeSet<Student>(studentSortById);
		
		Student s1 = new Student ("Vighnesh",2,"SangvadeWadi");
		Student s2 = new Student ("Rohit",4,"Koge");
		Student s3 = new Student ("Sam",1,"Balinge");
		
		treeSet1.add(s1);
		treeSet1.add(s2);
		treeSet1.add(s3);
		
		System.out.println("Sorted By Name : " +treeSet1);
		
		treeSet2.add(s1);
		treeSet2.add(s2);
		treeSet2.add(s3);
		
		System.out.println("Sorted By Village : " +treeSet2);

		
		treeSet3.add(s1);
		treeSet3.add(s2);
		treeSet3.add(s3);
		
		System.out.println("Sorted By Id : " +treeSet3);
		
		
	}
}
