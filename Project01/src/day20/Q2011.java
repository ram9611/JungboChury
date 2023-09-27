
package day20;
/*
 * Q1811(고급). 파라미터로 정수 값(n)을 하나 받아서,
	피보나치 수열의 n항에 해당하는 값을 리턴하는 메서드 fibo()를 작성하고,
	이를 사용하여 int형으로 표현할 수 있는 모든 피보나치 수열의 값을 출력.

	(실행결과)	fibo(1) = 1
			fibo(2) = 1
			fibo(3) = 2
			...
			fibo(45) = 1134903170
			fibo(46) = 1836311903
			fibo(47) = int로 표현할 수 있는 범위를 벗어남.

 * 
 */
public class Q2011 {
	
	static int fibo(int n) {
		
		if(n>46)
			return -1;
		
		if(n==1||n==2)
			return 1;
		
		return fibo(n-1)+fibo(n-2);
	}
	
	public static void main(String[] args) {
		int num = fibo(47);
		System.out.println(num==-1?"int로 표현할 수 있는 범위를 벗어남.":num);
	}
}
