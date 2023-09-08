package day5;
/*
 * 삼항연산자를 사용해서 절대값 출력
 * 
 */

import java.util.Scanner;

public interface Ex502 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수입력: ");
		int input=sc.nextInt();
		
		System.out.println(input+"의 절대 값 :");
		System.out.println(input>=0?input:-input);
		
		/*if(input>=0)
			System.out.println(input);
		else
			System.out.println(-input);*/
	}
}
