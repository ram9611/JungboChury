package day18;

import java.util.Scanner;

/*
 * 연습3.
	(실행결과의 예) 정수 몇 개? 3 (엔터)
			입력1 : 5 (엔터)
			입력2 : 8 (엔터)
			입력3 : 2 (엔터)
			합계 = 15
	(main() 의 마지막 줄)
		   sysout("합계 = " + sum(arr));

 * 
 * 
 */
public class Q1803 {
	
	static int sum(int[] arr) {
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			sum+=arr[i];
			
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 몇 개? ");
		int num=sc.nextInt();
		
		int[] arr=new int[num];
		
		for(int i=1;i<=num;i++) {
			
			
			System.out.print("입력"+i+": ");
			arr[i-1]=sc.nextInt();
			
		}
		
		System.out.println("합계: "+sum(arr));
		
	}
}
