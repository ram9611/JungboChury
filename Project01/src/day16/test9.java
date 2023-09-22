package day16;

import java.util.Arrays;

public class test9 {
	public static void main(String[] args) {
		
		boolean[] arr=new boolean[100]; // for문에서 생성된 소수 담는 배열 생성 
		int[] arr1=new int[10];
		
		for(int i=1;i<=100;i++) {
			
			int cnt=0;
			
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					cnt++;
		}
		if(cnt==2) 
			arr[i]=true;
			
			
		}
		
		for(int i1=0;i1<arr1.length;i1++) {
			
		
			for(int j1=0;j1<arr.length;j1++) {
				
				if(arr[j1]) {
					arr1[i1]=j1;
					arr[j1]=false;
					break;
				}
					
			}
			
		}
		
		
		System.out.println(Arrays.toString(arr1));
		
	}
}
