package oop.chap07.poly;

public class Tea extends Beverage {
	static int amount;
	public Tea(String name) {//Tea가 판매 
		super(name);
		amount++;
		//주문되는 음료의 가격을 계산
		calcPrice();
	}
	@Override
	public void calcPrice() {
		if(getName().equals("lemontea")){
			setPrice(1500);
			
		}else if(getName().equals("ginsengTea")) {
			setPrice(2000);
			
		}else if(getName().equals("redginsengTea")) {
			setPrice(2500);
			
		}else {
			setPrice(10);
		
		}


	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
