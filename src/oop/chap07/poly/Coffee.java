package oop.chap07.poly;

public class Coffee extends Beverage {
	static int amount;
	public Coffee(String name) {
		super(name);
		amount++;
		calcPrice();
	}
	@Override
	public void calcPrice() {
		if(getName().equals("Americano")){
			setPrice(1500);
		}else if(getName().equals("CafeLatte")) {
			setPrice(2500);
		}else if(getName().equals("Cappuccino")) {
			setPrice(3000);
		}else {
			setPrice(10);
		}
	}
	//static멤버를 액세스하기 위해서 static메소드를 정의해서 액세스한다.
	public static int getAmount() {
		return amount;
	}
}









