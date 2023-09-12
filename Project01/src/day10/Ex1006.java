package day10;

import java.util.Arrays;

/*
 * 배열의 생성
 * [정리]
 * 	1)배열(배열객체)을 가리킬 변수를 선언 : 타입[] 변수이름
 * 		ex) int[] scores;
 * 	2)배열(배열객체)을 생성해서 위의 변수와 연결 : 변수이름 = new 타입[크기];
 * 		ex) scores=new int[3]
 * 
 * 
 * 
 */
public class Ex1006 {
	public static void main(String[] args) {
		
		int[] arr; // int형 배열을 가리킬 변수 arr을 선언함.
		arr=new int[3]; // 크기가 3인 배열 생성 후 변수와 연결.
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		// 배열 출력1 : Arrays.toString(배열이름)을 사용
		System.out.println(Arrays.toString(arr));
		//[10,20,30]
		
		// 배열 출력2: 반복문 사용
		for(int i=0;i<=2;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// 배열 출력3: 향상된 for문 (for-each문)
		// for(변수선언: 배열이름){...}
		for(int n:arr) {
			
			System.out.print(n+" ");
		}
		
	}
}
