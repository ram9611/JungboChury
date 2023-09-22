package day19;

import java.util.Arrays;

/*
 * Q1706.	파라미터로 int형 배열 2개를 받아서
	두 배열의 길이가 같다면 두 배열 요소들을 모두 교환하는 메서드 swap() 을 작성하세요.
	성공적으로 모든 요소들을 서로 교환했다면 true를 리턴하고, 그렇지 않으면 false를 리턴하도록 
	하세요.
		static boolean swap(int[] arr1, int[] arr2)	
							Hint. int t = a; a = b; b = t;
	(실행결과의 예)	swap전 arr1 : [3, 2, 4, 5] 
			swap전 arr2 : [6, 7, 2, 5] 
			swap 성공!
			swap후 arr1 : [6, 7, 2, 5] 
			swap후 arr2 : [3, 2, 4, 5] 

 * 
 * 
 */
public class Q1906 {
	
	static boolean swap(int[]arr1, int[] arr2) {
		
		if(arr1.length==arr2.length) {
		for(int i=0;i<arr1.length;i++) {
			
			
			
			int tmp=arr1[i];
			arr1[i]=arr2[i];
			arr2[i]=tmp;
			
		}
		return true;
		}else
			{return false;}
		
	}
	
	public static void main(String[] args) {
		
		int[] arr1= {3,2,4,6};
		int[] arr2= {6,7,2,5};
		
		System.out.println("swap전 arr1: "+Arrays.toString(arr1));
		System.out.println("swap전 arr2: "+Arrays.toString(arr2));
		
		
		System.out.println("swap"+(swap(arr1,arr2)?"성공":"실패"));
		
			
		System.out.println("swap후 arr1: "+Arrays.toString(arr1));
		System.out.println("swap후 arr2: "+Arrays.toString(arr2));
		
		
		
		
	}
}
