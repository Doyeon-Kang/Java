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
		address = "서울시 강남구 역삼동 111-333";
		date = 20201102;
		time = 130258;
		price = 35000;
		menuNum = "0003";
	}
	
	public String showInfo() {
		return "새로운 주문이 들어왔습니다!\n"
				+ "주문 접수 번호 : " +orderNum
				+"\n주문 핸드폰 번호 : " +phoneNum
				+"\n주문 집 주소 : " +address 
				+"\n주문 날짜 : " +date
				+"\n주문 시간 : " +time 
				+"\n주문 가격 : " +price
				+"\n메뉴 번호 : " +menuNum;
	}
}
