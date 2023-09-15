package day14;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 6)	[고급]	[10, 20, 30, 40, 50] 이라는 배열을 '간편법'으로 만들고,
	위치(인덱스)를 의미하는 정수 값을 입력받아 그 위치의 요소를 삭제.

	(실행결과의 예)	arr : [10, 20, 30, 40, 50]        <-- sysout(Arrays.toString(arr)); 의 실행결과.
			삭제할 요소의 위치 : 3 (엔터)
			arr : [10, 20, 30, 50]            <-- sysout(Arrays.toString(arr)); 의 실행결과.

 * 
 * 
 */
public class Q1406 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] arr= {10,20,30,40,50};
		System.out.println(Arrays.toString(arr));
		
		System.out.print("삭제할 요소의 위치 : ");
		int num=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(i==num)
				arr[i]=0;
		}
		
		int[] arr2=new int[arr.length-1];
		
		if(num==arr.length-1) {
			
			for(int i=0;i<arr2.length;i++) {
				arr2[i]=arr[i];
			}
			
			System.out.println(Arrays.toString(arr2));
		}
		
		else{
			
			for(int i=0;i<arr2.length;i++) {
			
			arr2[i]=arr[i];
			
			if(arr[i]==0) {
				arr2[i]=arr[i]+arr[i+1];
			}
			
			
			
		}
		
		System.out.println(Arrays.toString(arr2));
		}
	}
}
