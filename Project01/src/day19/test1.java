package day19;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1) 3개의 정수를 파라미터로 받아서 이들 중 가장 큰 값을 출력하는 메서드 showSum()
 * 
 */
public class test1 {
	

	static int getMedian(int a, int b, int c){


		int avg=(a+b+c)/3;

		int avg_a=(avg-a>0?avg-1:(avg-a)*-1);
		int avg_b=(avg-b>0?avg-1:(avg-b)*-1);
		int avg_c=(avg-c>0?avg-1:(avg-c)*-1);

		int mid=(avg_a<avg_b&&avg_a<avg_c?a:avg_b<avg_c?b:c);

		return mid;

		}


		public static void main(String[] args){

		Scanner sc =new Scanner(System.in);

		System.out.print("첫번쨰 정수입력: ");
		int a=sc.nextInt();

		System.out.print("두번쨰 정수입력: ");
		int b=sc.nextInt();

		System.out.print("세번쨰 정수입력: ");
		int c=sc.nextInt();


		int mid=getMedian(a,b,c);

		System.out.println("중간값: "+mid);

		}
}