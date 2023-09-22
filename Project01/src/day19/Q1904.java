package day19;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Q1704.	첫 번째 파라미터로 int형 배열(arr)을
	두 번째 파라미터로 int값(key)을 받아서,
	그 배열에서 그 값의 위치(인덱스) 값을 리턴하는 메서드 search()를 작성해 보세요.
	이 메서드는 배열에 그 값이 존재하면 그 인덱스를, 존재하지 않으면 -1을 리턴하도록 합니다.
		static int search(int[] arr, int key)
	(실행결과의 예)	배열 arr : [3, 2, 4, 5, 1]         <---- 1~10 난수 발생으로 채운 후 출력.
			값 입력 : 5 (엔터)
			arr[3] = 5

 * 
 * 
 */
public class Q1904 {
	
	static int search(int[] arr,int num) {
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==num)
				return i;
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		boolean[] check=new boolean[10];
		int[] arr= new int[5];
		for(int i=0;i<arr.length;i++) {
			
			int num=(int)(Math.random()*10+1);
			if(check[num-1]) {
				i--;
				continue;
			}
			check[num-1]=true;
			arr[i]= num;
			
		}
		System.out.println("배열 arr: "+Arrays.toString(arr));
		System.out.print("값 입력: ");
		int num=sc.nextInt();
		
		int idx=search(arr,num);
		if(idx!=-1)
			System.out.println("idx["+idx+"] = "+arr[idx]);
		else
			System.out.println("해당 값은 배열에 없습니다.");
	}
}
