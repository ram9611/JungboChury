package day5;
/*
 * 정수 값 하나를 입력 받아서,
 * 10보다 크고 30보다 작은지 판단해서 출력.
 * (실행결과 예) 정수 입력 : 17
 * 					   17은 10보다 크고 30보다 작은 수임!
 * 
 * (실행결과 예) 정수 입력 : 38
 * 					  38은 10보다 크고 30보다 작은 수가 아님!	
 * 
 */

import java.util.Scanner;

public class Q504 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수 입력");
		int num=sc.nextInt();
		
		if(num<17)
			System.out.printf("%d는 17보다 작은수\n",num);
		
		else if(num>17&&num<30)
			System.out.printf("%d는 17보다 크고 30보다 작은 수\n",num);
		
		else
		
		
	}
}
