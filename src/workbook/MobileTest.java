package workbook;

public class MobileTest {
	public static void main(String[] args) {
		MobileLtab L = new MobileLtab("Ltab",500,"AP-01");
		MobileOtab O = new MobileOtab("Otab",1000,"AND-20");
		
		System.out.println("Mobile"+"\t\t"+"Battery"+"\t\t"+"OS");
		System.out.println("-------------------------------------------");
		System.out.println(L.getMobileName()+"\t\t"+L.getBatterySize()+"\t\t"+L.getOsType());
		System.out.println(O.getMobileName()+"\t\t"+O.getBatterySize()+"\t\t"+O.getOsType());
		
		L.charge(10);
		O.charge(10);
		
		System.out.println("10분 충전");
		System.out.println("Mobile"+"\t\t"+"Battery"+"\t\t"+"OS");
		System.out.println("-------------------------------------------");
		System.out.println(L.getMobileName()+"\t\t"+L.getBatterySize()+"\t\t"+L.getOsType());
		System.out.println(O.getMobileName()+"\t\t"+O.getBatterySize()+"\t\t"+O.getOsType());
		
		L.operate(5);
		O.operate(5);
		
		System.out.println("5분 통화");
		System.out.println("Mobile"+"\t\t"+"Battery"+"\t\t"+"OS");
		System.out.println("-------------------------------------------");
		System.out.println(L.getMobileName()+"\t\t"+L.getBatterySize()+"\t\t"+L.getOsType());
		System.out.println(O.getMobileName()+"\t\t"+O.getBatterySize()+"\t\t"+O.getOsType());
	}

}
