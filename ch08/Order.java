package ch08;

public class Order {
	String orderNum;
	String phoneNum;
	String address;
	int date;
	int time;
	int price;
	String menuNum;
	
	public Order() {
		orderNum = "202011020003";
		phoneNum = "01023450001";
		address = "����� ������ ���ﵿ 111-333";
		date = 20201102;
		time = 130258;
		price = 35000;
		menuNum = "0003";
	}
	
	public String showInfo() {
		return "���ο� �ֹ��� ���Խ��ϴ�!\n"
				+ "�ֹ� ���� ��ȣ : " +orderNum
				+"\n�ֹ� �ڵ��� ��ȣ : " +phoneNum
				+"\n�ֹ� �� �ּ� : " +address 
				+"\n�ֹ� ��¥ : " +date
				+"\n�ֹ� �ð� : " +time 
				+"\n�ֹ� ���� : " +price
				+"\n�޴� ��ȣ : " +menuNum;
	}
}
