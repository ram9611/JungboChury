package day14;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 아래와 같이 입력한 값들을 배열에 담은 후, 배열 요소들을 별의 개수라 보고 별들을 출력하는 프로그램을 작성해 보세요.
	(실행결과의 예)	입력할 항목(숫자)의 개수 : 5 (엔터)
	모든 항목을 입력 (spacebar로 구분) : 3 2 5 0 7(엔터)
	0 : ***
	1 : **
	2 : *****
	3 : 
	4 : *******
 * 
 * 
 * 
 */
public class Q1401 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("입력할 항목의 개수 : ");
		int num=sc.nextInt();
		
		int[] arr=new int[num];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=(int)(Math.random()*10);
			//System.out.print(arr[i]+" ");
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(i+": ");
			for(int j=0;j<arr[i];j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
