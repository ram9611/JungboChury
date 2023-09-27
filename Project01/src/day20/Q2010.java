package day20;
/*
 * Q1810(고급). 파라미터로 정수 값(n) 하나를 받아서, 
	n!을 구하여 리턴하는 메서드 fact()를 작성하고,
	이를 사용하여 int형으로 표현할 수 있는 모든 팩토리얼 값을 출력.
	(실행결과) 	1! = 1
		   	2! = 2
			3! = 6
			...
			11! = 39916800
			12! = 479001600
			13! = int로 표현할 수 있는 범위를 벗어남.

	Hint. int형으로 표현할 수 있는 최대 값 : Integer.MAX_VALUE
 * 
 * 
 */
public class Q2010 {
	
	static int fact(int n) {
		
		if(n>13)
			return -1;
		
		if(n==0)
			return 1;
		
		return n*fact(n-1);
	
	}
	
	public static void main(String[] args) {
		
		int mul=fact(14);
		System.out.println(mul==-1?"int형 값을 벗어났습니다":mul);
		
	}
}
