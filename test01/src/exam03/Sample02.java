package exam03;

public class Sample02 {

	public static void main(String[] args) {

		/*
		 * 지역 변수 사용할 때 주의사항
		 * 		지역 변수를 사용할 때에는 반드시 초기화가 되어 있어야 한다.
		 */

		int i1 ; // 선언만 한 상태
		i1 = 1; // 초기화를 시켜주면 에러가 나오지 않는다.
		
		System.out.println(i1);
		
		/*
		 * 상수 : 변하지 않는 값을 의미힌다.
		 * 자바 프로그램에서는 한 번 초기화를 한 후에는 변경되지 않는 값을 의미
		 */
		final int number ;
		number = 2;
		
		/*
		 * 변수명 명명 규칙
		 * 		1. 한글 사용 X -> 상관없지만 용량 크기가 더 커짐
		 * 		2. 띄어쓰기 금지, 대신 _(언더바) 사용
		 * 		3. 숫자는 영문자 뒤에 작성 = 영문자 먼저
		 * 		4. 영문자는 대소문자 구분하여 사용해야 함
		 * 		5. 예약어를 사용하면 안됨
		 * 		6. 자바에서 $ 특수문자도 사용할 수 있다.
		 * 		
		 * 		권고 사항
		 * 			상수명을 작명할 때 반드시 대문자로만 작명할 것.
		 */
		
		int i = 1;
		int I = 2;
		
		System.out.println(i);
		
		byte x = 127;
		System.out.println(x);
		
	}

}
