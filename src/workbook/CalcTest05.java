package workbook;

import java.util.Scanner;

public class CalcTest05 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		Calc calc = new Calc();
		int sum = calc.clacSum(a, b, c, d);
		double avg = (double)sum/args.length;
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);

		
		if(avg<=100 & avg>=90) {
			System.out.println("A");
		}else if(avg<90 & avg>=70) {
			System.out.println("B");
		}else if(avg<70 & avg>=50) {
			System.out.println("C");
		}else if(avg<50 & avg>=30) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}
}
