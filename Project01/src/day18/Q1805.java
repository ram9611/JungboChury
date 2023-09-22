package day18;

import java.util.Arrays;

/*
 * 
 * 파라미터로 int형 배열을 전달 받아서, 모든 요소를 절대값으로 만들어주는 메서드.
	-10 ~ +10 사이의 정수 5개(난수발생)를 배열에 담아주세요.
	(실행결과의 예) 메서드 호출 전, 배열 = [-8, 5, -2, -1, 7]
			메서드 호출 후, 배열 = [8, 5, 2, 1, 7]
 */
public class Q1805 {
	
	static int[] abs(int[] arr) {
		
		
		for(int i=0;i<arr.length;i++) {
			
		
			arr[i]=(arr[i]>=0?arr[i]:arr[i]*-1);
			
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] arr= new int[5];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=(int)(Math.random()*21-10);
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		abs(arr);
		System.out.println(Arrays.toString(arr));
	}
}
