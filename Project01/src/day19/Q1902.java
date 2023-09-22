package day19;

import java.util.Scanner;

/*
 * 
 * Q1702(고급). hasNine(int number) 메서드를 만들어보세요.
	이 메서드는 파라미터로 받은 정수 값이 숫자 9를 포함하고 있는지의 여부를 리턴합니다. 예를 들어, 19, 119, 2397 등은 숫자 9를 포함하고 있어서 true를 리턴하고, 18 128 2367 등에 대해서는 숫자 9를 포함하고 있지 않으므로 false를 리턴합니다.
	작성한 메서드를 이용하여, main() 에서는 아래의 실행결과와 같이 숫자들을 입력받아서 이 숫자들 중 9를 포함하는 숫자들의 합계를 출력하도록 프로그램 작성.

	(실행결과의 예)	정수 값을 입력 (-1은 종료) : 1 (엔터)
			정수 값을 입력 (-1은 종료) : 2 (엔터)
			정수 값을 입력 (-1은 종료) : 3 (엔터)
			정수 값을 입력 (-1은 종료) : 9 (엔터)
			정수 값을 입력 (-1은 종료) : 18 (엔터)
			정수 값을 입력 (-1은 종료) : 19 (엔터)
			정수 값을 입력 (-1은 종료) : 901 (엔터)
			정수 값을 입력 (-1은 종료) : -1 (엔터)
			9를 포함한 숫자들의 합계 = 929

	(+고급화)	9 + 19 + 901 = 929
 * 
 */
public class Q1902 {
	
	
	static boolean hasNine(int num) {
		
		while(true) {
		
		int a=num%10;
		if(a==9) return true;
		
		num-=a;
		num/=10;
		
		
		if(num<10)
		return false;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int sum=0;
		while(true) {
			
			System.out.print("정수 값을 입력(-1은 종료): ");
			int num=sc.nextInt();
			
			if(hasNine(num)) {
				sum+=num;
			}
			
			if(num==-1)
				{System.out.println("9를 포함한 숫자들의 합계= "+sum);
				break;}
			
		}
	}
}
