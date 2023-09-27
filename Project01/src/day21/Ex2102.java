package day21;

public class Ex2102 {
	
	static int plus(int a, int b) {
		
		return a+b;
		
	}
	
	/*static int plus(int x, int y) {
		
		return x+y;--> err
	}*/
	
	/*static double plus(int a, int b) {
		
		
		return a+b;-->err : 리턴 타입이 다르다고 해서 오버로딩 된 것은 아님.
	}*/
	
	public static void main(String[] args) {
		
		int sum=plus(3,5);
		System.out.println(sum);
	}
}
