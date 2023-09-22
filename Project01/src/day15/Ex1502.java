package day15;

import java.util.Arrays;

/*
 * 1) 출력 (형식은 자유)	2) 출력		3) x10 후 출력
		[1, 2, 3]	   [1 2 3]	   [10 20 30]
		[4, 5, 6]	   [4 5 6]	   [40 50 60]
		[7, 8, 9]	   [7 8 9]	   [70 80 90]
	
	
	4) 모든 요소의 합 = ___
	5) 모든 요소의 평균 = ___
	6) 최대 값 = ___
	7) 최소 값 = ___

 * 
 * 
 * 
 */
public class Ex1502 {
	public static void main(String[] args) {
		
		int[][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		// 1)
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println();
		//2
		for(int i=0;i<arr.length;i++) {
			System.out.print("[");
			for(int j=0;j<arr[i].length;j++) {
				
				
				if(j==arr[i].length-1)
					{System.out.print(arr[i][j]);
					break;}
				
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.print("]");
			System.out.println();
			
		}
		
		
		int sum=0;
		int avr=0;
		int max=arr[0][0];
		int min=1000;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				arr[i][j]=arr[i][j]*10;
				sum+=arr[i][j];
				
				if(max<arr[i][j])max=arr[i][j];
				if(min>arr[i][j])min=arr[i][j];
			}
			
		}
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println("총합: "+sum);
		avr=sum/(arr[0].length+arr[1].length+arr[2].length);
		System.out.println("평균: "+avr);
		System.out.println("최대 값: "+max);
		System.out.println("최소 값: "+min);
	}
}
