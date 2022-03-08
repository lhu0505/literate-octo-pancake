package exam03;

import java.util.Scanner;

public class Sample04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;		//선언부
		
		System.out.print("첫 번째 정수 값 입력 : ");
		num1 = sc.nextInt();		// 초기값
		
		System.out.print("두 번째 정수 값 입력 : ");
		num2 = sc.nextInt();		// 초기값
				
		int result = num1 + num2;	// 계산, 로직
		
		System.out.printf("결과 : %d", result); // 결과 출력
		
	}

}
