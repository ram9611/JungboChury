package day10;
/*
 * 
 * 1~100 사이의 모든 정수의 합
 */
public class Q1003 {
		
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			
			sum+=i;
			
		}
		
		System.out.print("1~100 모든 정수의 합 : "+sum);
		
	}
	
}
