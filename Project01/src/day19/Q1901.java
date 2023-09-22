package day19;

import java.util.Scanner;

/*
 * Q1701. 연습. exponent(int base, int exp) 메서드를 만들어보세요.
	이 메서드는 base의 exp승을 리턴합니다. 아래와 같은 실행결과가 되도록
	main() 메서드를 완성해보세요. (단, Math 클래스의 라이브러리 메서드 사용을 금지)

	(실행결과의 예)
		base 입력 : 2 (엔터)
		exp 입력 : 4 (엔터)
		2의 4승 = 16
 * 
 * 
 */
public class Q1901 {
	
	static int exponent(int base, int exp) {
		
		int base_1=1;
		
		for(int i=1;i<=exp;i++) {
			
			
			base_1*=base;
			
		}
		
		return base_1;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("base 입력: ");
		int base=sc.nextInt();
		
		System.out.print("exp 입력: ");
		int exp=sc.nextInt();
		
		System.out.println(exponent(base, exp));
	}
}
