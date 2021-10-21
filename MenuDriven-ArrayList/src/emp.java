/*Assignment No:1 on ArrayList:
Menu Driven Application with follwing Choices using ArrayList:
1. Add New Employee (empno,ename,sal,dept taken form user)
2. Update salary by empno ( empno and new salary taken from user)
3. Display employee details by empno (empno taken from user)
4. Show all employee details for a given dept in tabular form( dept taken from user)
5. Display all Employees details
6. Remove employee details by empno
0: Exit*/

public class emp {
private int empno;
private String ename;
private int sal;
private String dept;
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public emp()
{
	
}
public emp(int empno, String ename, int sal, String dept) {
	super();
	this.empno = empno;
	this.ename = ename;
	this.sal = sal;
	this.dept = dept;
}
}
