package day20;
/*
 * Ex1806. 최대공약수(GCD)
		119 68

		119 = 7 * 17
		68 = 2 * 2 * 17
		
※ 유클리드 호제법 : Ex) gcd(119, 68)
(고...)			= gcd(68, 119%68=51)
				= gcd(51, 68%51=17)
				= gcd(17, 0)
				= 17
 * 
 * 
 */
public class Ex2005 {
	
	static int gcd(int num1, int num2) {
		
		if(num2==0)
			return num1;
		else
			return gcd(num2,num1%num2);
	}
	
	public static void main(String[] args) {
		
		System.out.println(gcd(119,68));
		
	}
}
