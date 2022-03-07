package exam01;

public class Sample02 {

	public static void main(String[] args) {
		
		int i = 30;
		System.out.printf("당신은 현재 %d대 입니다.\n", i);
		System.out.println("반갑습니다.");
		System.out.printf("당신은 현재 %o대 입니다.\n", i);
		System.out.printf("당신은 현재 %x대 입니다.\n", i);
		System.out.printf("당신은 현재 %c대 입니다.\n", i+3);
		
		double d = 1234.5678;
		double d2 = 1234.567812353;
		System.out.printf("%f\n",d);
		System.out.printf("%.10f\n",d);
		System.out.printf("%e\n",d);
		System.out.printf("%g\n",d);
		System.out.printf("%g2\n",d);
		System.out.printf("%A\n",d);

		boolean b1 = true;
		System.out.println(b1);
	}

}
