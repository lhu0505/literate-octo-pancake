package exam04;

public class Sample02 {

	public static void main(String[] args) {

		//산술 연산자
		//+, -, *, /나누기, %나머지
		int num1, num2;
		
		num1 = 10; num2 = 3;
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
		System.out.printf("%d / %d = %f\n", num1, num2, (double)num1/num2);
		System.out.printf("%d %% %d = %d\n", num1, num2, num1%num2);
		
		
		//비교 연산자
		System.out.printf("%d == %d ->  %b\n", num1, num2, num1 == num2);
		System.out.printf("%d != %d ->  %b\n", num1, num2, num1 != num2);
		System.out.printf("%d < %d ->  %b\n", num1, num2, num1 < num2);
		System.out.printf("%d > %d ->  %b\n", num1, num2, num1 > num2);
		System.out.printf("%d <= %d ->  %b\n", num1, num2, num1 <= num2);
		System.out.printf("%d >= %d ->  %b\n", num1, num2, num1 >= num2);
		
		//논리 연산자
		//&&and ||or 
		//TUR, FALSE 논리 값을 가지고 연산을 수행해야 한다.
		System.out.printf("%b, && %b -> %b\n", true, true, true&&true);
		System.out.printf("%b, && %b -> %b\n", true, false, true&&false);
		System.out.printf("%b, && %b -> %b\n", false, true, false&&true);
		System.out.printf("%b, && %b -> %b\n", false, false, false&&false);
		
		System.out.printf("%b, || %b -> %b\n", true, true, true||true);
		System.out.printf("%b, || %b -> %b\n", true, false, true||false);
		System.out.printf("%b, || %b -> %b\n", false, true, false||true);
		System.out.printf("%b, || %b -> %b\n", false, false, false||false);
		
		

	}

}
