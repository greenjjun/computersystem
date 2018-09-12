package coffee;

public class HighSchoolStudent extends Student implements Identifiable, NameInterface {
	
	protected String club;
	protected String special;
	
	public HighSchoolStudent(String name, int grade, int classNum, int studentNum, String club, String special) {
		super(name, grade, classNum, studentNum);
		this.club = club;
		this.special = special;
	}
	
	@Override
	public void introduce() {
		super.introduce();
		System.out.println(club + "�� �ҼӵǾ� �ִ� " + special + "�Դϴ�.");
	}
	
	@Override
	public int getId() {
		return getStudentId();
	}
}
