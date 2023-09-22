package day15;

import java.util.Arrays;

/*
 * Q1401(고급). 난수 발생(1~9)해서, 
		중복된 요소 없이 배열(3x3)을 채운 후
	1) 출력
	2) (위 배열을) 시계방향으로 90도 회전해서 출력
	3) (위 1)의 배열을) 반시계반향으로 90도 회전해서 출력

	(실행결과의 예)
		3 6 2
		1 5 7
		4 9 8
		시계방향 회전:
		4 1 3
		9 5 6
		8 7 2
		반시계방향 회전:
		2 7 8
		6 5 9
		3 1 4

 * 
 * 
 */
public class Q1501 {
	public static void main(String[] args) {
		
		int[][] arr=new int[3][3];
		boolean[] num=new boolean[9];
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				int abc=(int)(Math.random()*9+1);
				arr[i][j]=abc;
				
				if(num[abc-1]) {
					j--;
					continue;
				}
				
				num[abc-1]=true;
				
				
				
			}
			
		}
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=arr.length-1;j>=0;j--) {
				
				System.out.print(arr[j][i]+" ");
			}
			
			System.out.println();
		}
		
		
		System.out.println();
		
		for(int i=arr.length-1;i>=0;i--) {
			
			
			for(int j=0;j<arr.length;j++) {
				
				System.out.print(arr[j][i]+" ");
				
			}
			
			System.out.println();
		}
		
		
	}
}
