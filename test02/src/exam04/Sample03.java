package exam04;

import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("첫 번째 값 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 값 입력 : ");
		num2 = sc.nextInt();
		
		int r1, r2, r4;
		double r3;
		r1 = num1 + num2;
		r2 = num1 - num2;
		r3 = (double)num1/num2;
		r4 = num1%num2;
		
		System.out.println("두 수의 합은 : "+ r1);
		System.out.println("두 수의 차는 : "+ r2);
		System.out.printf("두 수의 나눈값은 : %.3f\n", r3);
		System.out.println("두 수의 나머지는 : "+ r4);
		
		

		

	}

}
