package day2;
/*
 * 산술 + 대입연산자
 * += -= *= /= %=
 * 
 * 
 */

public class Ex205 {
	public static void main(String[] args) {
		int a=3;
		int b=2;
		a+=b; // 처음에는 이렇게: a=a+b;라는 의미
		System.out.println(a);
		
		
		a*=b;
		System.out.println(a); // a=a*b -> 10
		
		
		b/=10;
		System.out.println(a); // b=b/10 -> 0
	}
}
