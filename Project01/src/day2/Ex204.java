package day2;
/*
 * 산술연산자(+ / - *  %)
 * 
 * "대입연산자"(=)
 * 
 * [주의] 나눗셈 연산자(/)
 * 1) 5/3---> (정수형 나눗셈)
 * 2) 5.0/3.0 --->(실수형 나눗셈)
 * 3) 5.0/3--->실수
 * 4) 5/3.0--->실수
 * 
 */
public class Ex204 {
	public static void main(String[] args) {
		double a=3;
		int b=2;
		System.out.println(a+b); //5? 5.0? 데이터 타입 일치가 필요->int 2를 double 2.0으로 자동 형변환
		
		// a+b먼저 수행 sysout은 후 수행
		
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("==========");
		
		int num=7237;
		
		//1의 자리
		System.out.println(num%10);
		//100의 자리
		System.out.println(num/100%10);
		//100의 자리
		System.out.println(num/100);
	}
}
