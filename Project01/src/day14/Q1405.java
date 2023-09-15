package day14;

import java.util.Arrays;

/*
 * 5)	[고급] 아래의 빈 칸에 코드를 작성하여 제시된 실행결과를 만들어 보세요.
	(두 배열을 결합)
		int[] arr1 = { 1, 3, 5, 7 };

		// TODO : 여기에 코드 작성.

		sysout("arr1 : " + Arrays.toString(arr1));
		sysout("arr2 : " + Arrays.toString(arr2));

		int[] arr3;

		// TODO : 여기에 코드 작성.

		sysout("arr3 : " + Arrays.toString(arr3));

	(실행결과)
		arr1 : [1, 3, 5, 7]
		arr2 : [6, 4, 2]
		arr3 : [1, 3, 5, 7, 6, 4, 2]
 * 
 * 
 */
public class Q1405 {
	public static void main(String[] args) {
		
		int[] arr1 = { 1, 3, 5, 7 };

		int[] arr2= {6,4,2};

		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));

		int[] arr3;

		arr3=new int[arr1.length+arr2.length];
		System.out.println(arr3.length);
		
		for(int i=0;i<=arr1.length-1;i++) {
			
			arr3[i]=arr1[i];
		}
		
		for(int i=arr1.length;i<arr3.length;i++) {
			arr3[i]=arr2[i-arr1.length];
		}
		
		System.out.println("arr3 : " + Arrays.toString(arr3));
	}
}
