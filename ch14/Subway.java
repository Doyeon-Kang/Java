package ch14;

public class Subway {
	private int number;
	private int price;
	private int passenger;
	
	public Subway(int number) {
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
	
	public void loadSubway(Student student) {
		passenger++;
		price += 1200;
		student.onSubway();
		System.out.println("½Â°´ ¼ö´Â " +passenger + " ¸í ÀÌ°í Å¾½Â·áÀÇ ÃÑ¾×Àº " +price +"¿ø ÀÔ´Ï´Ù.");
	}
}
