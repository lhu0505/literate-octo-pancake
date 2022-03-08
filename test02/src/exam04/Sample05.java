package exam04;

public class Sample05 {

	public static void main(String[] args) {

		// 복합 대입 연산
		// 대입(할당) 연산자와 산술연산이 결합되어 사용되는 연산자
		
		int num1 = 1;
		num1 += 1;
		System.out.println(num1);
		
		num1 += 2;
		System.out.println(num1);
		
		num1 /= 2;
		System.out.println(num1);
		
		num1 %= 2;
		System.out.println(num1);
		
		int age = 16;
	
		String result = age >= 20? "성인입니다." : "미성년자입니다.";
		System.out.println(result);
		
		int num2 = 15;
		result = num2 % 2 == 0 ? "짝수" : "홀수";
		System.out.printf("%d 는 %s 입니다.", num2, result);

	}

}
