package day18;
/*
 * 연습2.
	(실행결과의 예) 입력1 : 15 (엔터)
		        입력2 : 7 (엔터)
		        입력3 : 29 (엔터)
		        평균값 = 17.0
	(main() 의 마지막 줄)
		   sysout("평균값 = " + avg(a,b,c));

 * 
 * 
 */
import java.util.Scanner;

public class Q1802 {
	
	static double avg(int a, int b, int c) {
		
		
		double avg=(double)(a+b+c)/3;
		
		return avg;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("입력1: ");
		int a=sc.nextInt();
		
		System.out.print("입력2: ");
		int b=sc.nextInt();
		
		
		System.out.print("입력3: ");
		int c=sc.nextInt();
		
		System.out.println("평균값= "+avg(a,b,c));
		
	}
}
