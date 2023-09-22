package day17;

import java.util.Arrays;

/*
 * 소수의 판별이후 배열안에 넣기
 * 
 */
public class test3 {
	public static void main(String[] args) {
		
		int length=0;
		
	
		
		for(int i=1;i<=100;i++) {
			
			int cnt=0;
			
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					
					cnt++;
				}
				
			}
			
			if(cnt==2)
				length++;
			
			}
		
		int[] arr=new int[length];
		int idx=0;
		
		for(int i=1;i<=100;i++) {
			
			int cnt=0;
			
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					
					cnt++;
					
				}
				
			}
			
			if(cnt==2) {
				idx++;
				arr[idx-1]=i;
				
			}
			
			}
		
		
		System.out.println(Arrays.toString(arr));
		
	}
}
