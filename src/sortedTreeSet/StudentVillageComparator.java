package sortedTreeSet;

import java.util.Comparator;

public class StudentVillageComparator implements Comparator <Student>{

	@Override
	public int compare(Student s1, Student s2) {

		return s1.village.compareTo(s2.village);
	}

	
	
}
