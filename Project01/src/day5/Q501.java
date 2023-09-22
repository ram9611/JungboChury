package day5;

import java.util.Scanner;

/*
 * 3개의 정수를 입력받고
 * 이들 중에서 '중앙값'을 출력
 * 
 * 
 * 
 */
public class Q501 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번쨰 정수입력");
		int a=sc.nextInt();
		
		System.out.println("두번쨰 정수입력");
		int b=sc.nextInt();
		
		System.out.println("세번쨰 정수입력");
		int c=sc.nextInt();
		
		
		int median;
		
		median=((a>b&&a<c)||(a>c&&a<b)?a:((a>b&&a>c)&&(b>c))||((a<b&&a<c)&&(c>b))?b:c);
		System.out.println(median);
	}
}
