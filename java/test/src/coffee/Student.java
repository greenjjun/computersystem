package coffee;

public class Student {
	protected String name;
	protected int grade;
	protected int classNum;
	protected int studentNum;
	
	public Student(String name, int classNum, int studentNum) {
		this(name, 1, classNum, studentNum);
	}
	
	public Student(String name, int grade, int classNum, int studentNum) {
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.studentNum = studentNum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getClassNum() {
		return classNum;
	}
	
	public void setClassNum(int classNum) {
		this.classNum = classNum; 
	}
	
	public int getStudentNum() {
		return studentNum;
	}
	
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	
	public int getStudentId() {
		return grade*10000 + classNum*100 + studentNum;
	}
	
	public void introduce() {
		System.out.println(grade + "학년 " + classNum + "반 " + studentNum + "번 " + name + "입니다");
	}
}
