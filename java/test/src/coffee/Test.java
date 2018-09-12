package coffee;

import java.util.*;

public class Test {

	public static void main(String[] args) {
//		Student student = new Student("이석준", 1, 4, 20);
//		Scanner scanner = new Scanner(System.in);
//		String str = scanner.nextLine();
//		System.out.println(str);
//		
//		scanner.close();
//		
//		System.out.println(student.getStudentId());
//		student.introduce();
		
		HighSchoolStudent hS = new HighSchoolStudent("이정태", 1, 4, 29, "에드캔","천사");
		hS.introduce();
		
		Teacher teacher = new Teacher("이정태", "프로그래밍", 23423);
			
		List<Identifiable> identities = new ArrayList<>();
		identities.add(hS);
		identities.add(teacher);
		
		for (Identifiable iden : identities) {
			System.out.println(iden.getId());
		}
		
		List<NameInterface> names = new ArrayList<>();
		names.add(hS);
		names.add(teacher);
		
		for(NameInterface name : names) {
			System.out.println(name.getName());
		}
	}

}
