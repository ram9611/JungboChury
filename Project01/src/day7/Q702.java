package day7;

import java.util.Scanner;

/*
 * n:5
 * 
 * 01 02 03 04 05
 * 06 07 08 09
 * 10...
 * 
 * 
 */
public class Q702 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n=sc.nextInt();
		int n1=1;
		
		for(int a=1;a<=n;a++) { //1~n까지 증가반복 a를 통해 수행
			
			for(int b=n;b>=a;b--) { //n~a까지 감소반복 b를 통해 수행
				
				if(n1>=10) // 조건 true시 n1값 출력 : n1값이 10 이상이라면 true
					System.out.print(n1+" ");
				else
					System.out.print("0"+n1+" "); // false시 0+n1 출력
				n1++; //n1 증감연산자 
			}
			System.out.println(); // 이중반복문 수행완료후 엔터
		}
		
	}
}
