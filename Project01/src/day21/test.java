package day21;

public class test {
	
	static void m1(int num) {
		if(num==0) return;
		m1(num-1);
		System.out.print("*");
	}
	static String m2(int n) {
		if(n==0) return "";
		return "" + n%10 + m2(n/10);
	}
	
	public static void main(String[] args) {
		
		m1(4);
		System.out.println();
		System.out.println(m2(13475));	
	}
}
