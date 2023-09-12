package day11;

import java.util.Arrays;

/*
 * 연습
 * 크기가 10인 정수형 배열에,
 * 1~6 사이의 정수(난수)로 채우고 배열을 출력
 * 
 * 출력: 3가지 방법 다
 * 
 */
public class Q1103 {
	public static void main(String[] args) {
		
		int[] arr=new int[10];
		
		for(int i=0;i<=9;i++) {
			
			arr[i]=(int)(Math.random()*6+1);
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		for(int n : arr) {
			System.out.print(n+" ");
		}
		
	}
}
