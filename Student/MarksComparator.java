package InternPack;

import java.util.Comparator;

public class MarksComparator implements Comparator<StudentsInClass > {

	@Override
	public int compare(StudentsInClass o1, StudentsInClass o2) {
		if(o1.getMarks() > o2.getMarks())
			return -1;
		if(o1.getMarks() < o2.getMarks()) {
			return 1;
		}
		return 0;
	}

}
