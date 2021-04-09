package ch14;

public class Student {
	// 필드
	private String studentName;
	private int money;
	
	// 생성자
	public Student(String studentName) {
		this(studentName, 0);
	}
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 메소드
	public String toString() {
		return "이름: " +studentName +" / 잔액: " +money;
	}
	
	public void onBus() {
		money -= 1000;
	}
	
	public void onSubway() {
		money -= 1200;
	}

}
