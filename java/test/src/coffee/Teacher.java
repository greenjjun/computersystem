package coffee;

public class Teacher implements Identifiable, NameInterface {
	private int niceId;
	private String name;
	private String subject;
	
	public Teacher(String name,String subject,int niceId) {
		this.name = name;
		this.subject = subject;
		this.niceId = niceId;
	}
	

	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public int getId() {
		return niceId;
	}
}
