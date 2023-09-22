package day16;

import java.util.Scanner;

/*
 * 소수 2
 * 
 * 정수 입력: 7
 * 출력: 소수임 <-----23456
 * 
 * 정수 입력 : 9
 * 출력: 소수가 아님 <----2345678
*/
public class test3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		int num=sc.nextInt();
		
		int cnt=0;
		
		for(int i=1;i<=num;i++) {
			
			if(num%i==0)
				cnt++;
			
		}
		
		if(cnt==2)
			System.out.println("소수");
		else
			System.out.println("소수아님");
		
	}
}
