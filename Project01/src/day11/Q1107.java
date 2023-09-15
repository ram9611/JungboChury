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
		
		while(true) {
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=(int)(Math.random()*10+1);
			
			
			
		}
		
		if((arr[0]!=arr[1])&&(arr[0]!=arr[2])&&(arr[1]!=arr[2]))
			break;
		
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
					
				
			}
			
			
			
			
		}
		
		
		System.out.println(arr[1]);
		
	}
}
