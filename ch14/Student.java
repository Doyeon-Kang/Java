package ch14;

public class Student {
	// �ʵ�
	private String studentName;
	private int money;
	
	// ������
	public Student(String studentName) {
		this(studentName, 0);
	}
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// �޼ҵ�
	public String toString() {
		return "�̸�: " +studentName +" / �ܾ�: " +money;
	}
	
	public void onBus() {
		money -= 1000;
	}
	
	public void onSubway() {
		money -= 1200;
	}

}
