package day13;

import java.util.Arrays;

/*
 * 
 * 로또번호생성기2
 * -int 배열(size:6)
 * -중복체크
 * -정렬 알고리즘
 * 
 */
public class Ex1303 {
	public static void main(String[] args) {
		
		int[] arr=new int[6];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=(int)(Math.random()*45+1);
			
			boolean found = false;
			for(int j=0;j<=i-1;j++) {
				
				if(arr[i]==arr[j]) {
					found=true;
					break;
				}
			}
			
			if(found) {
				i--;
			}
			
			}
		
		
		System.out.println(Arrays.toString(arr));
		
		int count=0;
		
		for(int i=1;i<arr.length;i++) {
			
			for(int j=0;j<arr.length-2;j++) {
				
				if(arr[j]==arr[j+1])
					count++;
				
				if(arr[j]<arr[j+1]) {
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
					
				}
				
			}
			
		}
		
		
		
		if(count>0)
			System.out.println("중복발생");
		else
			System.out.println("중복없음");
		
		System.out.println(Arrays.toString(arr));
			
		
		
		
		
		
		
		
		
		/*System.out.print("Bubble Sort 결과: ");
		for(int i=1;i<=arr.length-1;i++) {
			
			
			for(int j=0;j<=arr.length-2;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
					
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		System.out.print("Insection sort 결과: ");
		for(int i=0;i<arr.length-1;i++) {
			
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
					
				}
			}
			
		}
		
		System.out.println(Arrays.toString(arr));*/
	}
}
