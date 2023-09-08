package day5;

import java.util.Scanner;

/*
 * 
 * [고급]
 * 0이상 100이하의 정수를 입력하지 않은 경우
 * "0부터 100사이의 값을 입력해주세요!"라고 출력하고
 * 제대로 입력할 때까지 반복해서 다시 입력 받아주세요.
 * 
 * switch문 연습
 * 요일을 한글로 받아서 영어로 출력.
 * 입력: 일
 * 출력: SUN
 * 
 * 주의) 세미클론(;)의 사용- 반복문/ 조건문에 사용시-->if문/ for문 등 사용시 중괄호{}를 여는데 이때 세미클론 넣지 마세요
 * 
 * 주의)'Scanner 객체'라는 건, 하나 만들어서 계속 쓰시는 거에요.
 * 
 */
public class Q509 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			
			System.out.print("정수입력 : ");
			int num=sc.nextInt();
			
			
				if(num>=1&&num<=100)
				{System.out.println(num);
				break;
				} else {System.out.println("1부터 100이하의 정수를 입력해주세요!");}
			
			
			
			
		}
		
	}
}
