package exam03;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		
		/*
		 * Scanner 클래스 import 필요
		 */
		
		//Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		
		//사용자 입력을 받고 재사용을 위해 변수에 저장.
		String sInput = sc.next();
		
		
		
		//변수에 저장된 사용자 입력 값을 출력
		System.out.println("사용자 입력 값 : "+ sInput);
		System.out.printf("사용자 입력 값 : %s\n", sInput);
		
	}

}
