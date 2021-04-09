package ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentKim = new Student();
		System.out.println(studentKim.showStudentInfo());
		
		Student studentLee = new Student(20185192, "±èÇÏ³ª", 2);
		System.out.println(studentLee.showStudentInfo());

	}

}
