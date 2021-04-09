package ch14;

public class Test {

	public static void main(String[] args) {
		Bus b1 = new Bus(100);
		Subway s1 = new Subway(2);
		
		Student student1 = new Student("Anna", 5000);
		Student student2 = new Student("Jake", 10000);
		Student student3 = new Student("Mike", 8000);
		
		b1.loadBus(student1);
		s1.loadSubway(student2);
		b1.loadBus(student3);
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		
		

	}

}
