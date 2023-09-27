package day21;
/*
 * Q1901. 메서드의 이름이 'practice'로 동일한 메서드 2개를 작성해 보세요.
	- 메서드1 : 리턴타입이 int
		    파라미터의 타입이 int
		    파라미터로 전달받은 값에 10을 더한 값을 리턴.
	- 메서드2 : 리턴타입이 double
		    파라미터의 타입이 double
		    파라미터로 전닯다은 값에 10을 뺀 값을 리턴.

 * 
 * 
 */
public class Q2101 {
	
	static int practice(int n) {
		
		return n+10;
	}
	
	static double practice(double n) {
		
		
		return n-10;
	}
	
	public static void main(String[] args) {
		
		int p1= practice(50);
		double p2= practice(1.345);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
