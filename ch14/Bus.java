package ch14;

public class Bus {
	private int number;
	private int price;
	private int passenger;
	
	public Bus(int number) {
		this.number = number;
		this.price = 0;
		this.passenger = 0;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void loadBus(Student student) {
		passenger++;
		price += 1000;
		student.onBus();
		System.out.println("�°� ���� " +passenger + " �� �̰� ž�·��� �Ѿ��� " +price +"�� �Դϴ�.");
	}
}
