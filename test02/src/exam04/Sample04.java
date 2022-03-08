package exam04;

import java.util.Scanner;

public class Sample04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("섭씨 값을 입력하세요 : ");
		int num = sc.nextInt();
		
		double result;
		result = ((double)num * 9/5) + 32;
		System.out.printf("변경 된 화씨 값 : %.2f", result);
		
		

	}

}
