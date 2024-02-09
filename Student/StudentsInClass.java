package InternPack;

public class StudentsInClass implements Comparable<StudentsInClass> {
	private String name;
	private String rollNumber;
	private double marks;
	int rank;
	public StudentsInClass(String name, String rollNumber, double marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		
		return " StudentInClass [name=" + name + ", rollNumber=" + rollNumber + ", marks=" + marks + ", rank=" + rank
				+ "]\n";
	}
	@Override
	public int compareTo(StudentsInClass o) {
		if(this.marks > o.marks) {
			return -1;
		}
		if(this.marks < o.marks)
			return 1;
		return 0;
		
	}
	
	
}
