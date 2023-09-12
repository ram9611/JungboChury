package day11;

import java.util.Arrays;

/*
 * 크기가 6인 정수형 배열을 만들고
 * 각 요소를 10~60으로 초기화 하고
 * 
 * 1)반복문을 사용해서 이 배열의 내용을 출력
 * 
 * 2)이 배열의 모든 요소의 총합을 출력.
 * 
 * 3)요소들 중 십의 자리가 짝수인 요소들만 출력
 * 
 * 4)이 배열에서 요소들 중 십의 자리가 짝수인 요소들의 부호를 -로 바꾼 후 배열 전체를 출력.
 * 
 */
public class Q1104 {
	public static void main(String[] args) {
		
		int[] arr=new int[] {10,20,30,40,50,60};
		
		//1
		System.out.print("[");
		for(int i=0;i<=5;i++) {
			
			System.out.print(arr[i]+",");
			if(i==5)
				System.out.print(arr[i]);
		}
		System.out.print("]");
		System.out.println();
		
		//2
		int sum=0;
		for(int i=0;i<=5;i++) {
			
			
			sum+=arr[i];
		}
		System.out.println("배열의 총합 : "+sum);
		
		
		//3
		for(int i=0;i<=5;i++) {
			
			if((arr[i]/10)%2==0)
				System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		//4
		int count=0;
		for(int n: arr) {
			
			
			if((n/10)%2==0)
				arr[count]=n*-1;
			count++;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
