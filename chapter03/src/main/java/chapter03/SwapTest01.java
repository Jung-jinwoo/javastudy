package chapter03;

public class SwapTest01 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		
		System.out.println(a + ":" + b);

		// swap 하기
		int tmp;
		tmp = a;
		a = b;
		b = tmp;
		
		System.out.println(a + ":" + b);
	}

}
