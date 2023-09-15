package day10;

import java.util.Scanner;

/*
 * 사용자로부터 소수인 정수만 입력 받아서 이들의 합계를 출력하느 프로그램
 * 단 소수가 아닌 수를 입력되면, 합계 출력 후 끝
 * 
 * 
 */
public class Q1008 {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		int sum=0;
		
		while(true) {
			
			System.out.print("소수를 입력하세요 : ");
			int num=sc.nextInt();
			
			int cnt=0;
			
			for(int i=1;i<=num;i++) {
				
				if(num%i==0) {
					cnt++;
				}
			}
			
			if(cnt==2) {
				sum+=num;
				
			}else {
				
				System.out.println("소수 총합: "+sum);
				break;
			}
			
			
			
		}
		
		
		
	}
	
	
}
