package day15;

import java.util.Arrays;

/*
 * 1차원 배열 = 인덱스가 하나인 배열
 * 2차원 배열 = 인덱스가 둘인 배열
 * 
 * 2차원 배열의 생성
 * 	-배열을 가리킬 변수의 선언
 * 		int[][]arr; // 2차원 int형 배열을 가리킬 변수의 선언.
 * 	-배열(배열객체)을 생성해서 위 변수와 연결
 * 		arr=new int[3][4] 3행(row) 4열(column)
 * 
 * 
 */
public class Ex1501 {
	public static void main(String[] args) {
		//1차원 배열의 간편법
		//int[] arr={10,20,30};
		
		//2차원 배열의 간편법
		int[][]arr= {
				{10,20,30,40},
				{50,60,70,80},
				{90,100,110,120}
				};
		
		
		for(int i=0;i<=arr.length-1;i++) { //행사이즈 arr.length
			
			for(int j=0;j<=arr[i].length-1;j++) { // 열사이즈 arr[i].length
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<=2;i++) {
			System.out.println(Arrays.toString(arr[i]));
			
		}
		
	}
}
