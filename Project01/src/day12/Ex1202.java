package day12;

import java.util.Arrays;

/*
 * 
 * 버블 정렬
 * -기본적인 정렬 알고리즘 3종: Bubble sort/ Insertion Sort/ Selection Sort
 * 
 */
public class Ex1202 {
	public static void main(String[] args) {
		
		int[] arr=new int[] {4,3,5,2,1};
		
		/*for(int i=0;i<arr.length;i++) {
			
			for(int j=i;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
			
		}*/
		
		
		
		for(int i=1;i<=arr.length-1;i++) {
			
			for(int j=0;j<=arr.length-2;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
					
				}
				
			}
			
			System.out.println(Arrays.toString(arr));
		}
		
	
		System.out.println("final array: "+Arrays.toString(arr));
	}
	
	
}
