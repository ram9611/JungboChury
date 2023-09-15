package day12;

import java.util.Arrays;

/*
 * 
 * Q1203(고급).
	크기가 4인 int형 배열을 만들고,
	이 배열에 1~10 사이의 난수로 채운 후 배열을 출력하고
	1) 이 배열의 오름차순/내림차순 여부를 출력.
	(실행결과의 예) [4, 3, 7, 9] ---> 오름차순도 내림차순도 아님.
	(실행결과의 예) [1, 2, 7, 8] ---> 오름차순임.
	(실행결과의 예) [8, 6, 4, 1] ---> 내림차순임.
		※ [1, 2, 2, 7] ---------> 얘는 오름차순이 아니라고 볼게요.

 * 
 */
public class Q1203 {
	public static void main(String[] args) {
		
		int[] arr=new int[4];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=(int)(Math.random()*10+1);
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		int count_up=0;
		int count_down=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]<arr[j]==false)
					count_up++;
			}
			
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]==false)
					count_down++;
				}
			
			}
		
		if(count_up==0) {
			System.out.println("오름차순입니다.");
		} else if(count_down==0) {
			System.out.println("내림차순입니다.");
		} else {
			System.out.println("오름차순도 아니고 내림차순도 아닙니다");
		}
		
	}
}
