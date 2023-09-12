package day11;

import java.util.Arrays;

/*
 * 크기가 3인 정수형 배열을 만들고
 * 여기에 1이상 10이하의 정수를 난수 발생하여 채워놓은 후
 * 
 * 1)이 배열을 출력
 * 2)이 배열의 중앙값을 출력해보세요
 * 
 * 예)[1,5,3]
 * 이 배열의 중앙값은 3입니다
 * 
 * [고급화]
 * 중복된 수가 없도록 난수 발생
 * 
 */
public class Q1107 {
	public static void main(String[] args) {
		
		
		int[] arr=new int[3];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=(int)(Math.random()*10+1);
			
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		int max=arr[0];
		int min=arr[0];
		int num=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max)
				max=arr[i];
			else if(arr[i]<min)
				min=arr[i];
			
		}
		
		arr[0]=max;
		arr[2]=min;
		System.out.println(arr[1]);
		
		
	}
}
