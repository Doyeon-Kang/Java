package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();  // 인스턴스 생성
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("이하나");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();

	}

}
