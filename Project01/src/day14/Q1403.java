package day14;

import java.util.Arrays;

/*
 * 3)	'간편법'으로 배열 [12, 57, 33, -1] 을 만들고,
	Arrays.toString() 을 사용하여 이 배열을 출력한 후,
	이 배열에서 최대 값, 최소 값을 찾아서 출력.
	(실행결과의 예)	배열 : [12, 57, 33, -1]
			최대 값 (인덱스#1) : 57
			최소 값 (인덱스#3) : -1
 * 
 * 
 */
public class Q1403 {
	public static void main(String[] args) {
		
		
		int[] arr= {12,57,33,-1};
		System.out.println(Arrays.toString(arr));
		
		int max=arr[0];
		int max_idx=0;
		
		int min=arr[0];
		int min_idx=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(max<arr[i]) {
				max=arr[i];
				max_idx=i;
			}
			
			if(min>arr[i]) {
				min=arr[i];
				min_idx=i;}
		}
		
		
		System.out.println("최대 값(인덱스#"+max_idx+") : "+max);
		System.out.println("최대 값(인덱스#"+min_idx+") : "+min);
	}
}
