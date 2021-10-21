
public class student {
	private int roll;
	private String name=new String();
	private int no_of_students;
	private String collegeName=new String();
	private int marks;
	private String grade=new String();
	private int start_roll;
	
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public int getRoll() {
	return roll;
}
public String getGrade() {
	return grade;
}
public student()
{
	 start_roll=1001;
 no_of_students=0;
	 marks=0;
	 grade="NA";
}
public student(int roll, String name, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
}
public void calGrade(){
	if(marks>=60)
	{
		 grade="A";
	}
	else
	{
		 grade="B";
	}
}
@Override
public String toString() {
	return "student [roll=" + roll + ", name=" + name + ", no_of_students=" + no_of_students + ", collegeName="
			+ collegeName + ", marks=" + marks + ", grade=" + grade + ", start_roll=" + start_roll + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + roll;
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
	student other = (student) obj;
	if (roll != other.roll)
		return false;
	return true;
}


}

