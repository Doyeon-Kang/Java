package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();  // �ν��Ͻ� ����
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("���ϳ�");
		studentLee.address = "���� ������";
		
		studentLee.showStudentInfo();

	}

}
