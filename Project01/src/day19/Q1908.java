package day19;

import java.util.Arrays;

/*
 * 고급2.
아래의 메서드들을 만들어서, 잘 만들어졌는지 main()에서 직접 테스트해보세요.
① 메서드 reverseArray(_______) : 파라미터로 전달된 정수형 배열의 순서를 뒤집어서 리턴.
테스트 → int[] arr = {3, 7, 2, 5, 4};
arr = reverseArray(arr);
 // arr 출력해서, [4, 5, 2, 7, 3]로 출력되는지 체크!

② 메서드 insertElementToArray(____,____,____) : 파라미터#1로 전달된 정수형 배열에,
파라미터#2(=인덱스번호) 위치에 파라미터#3(=새로운 값)을 추가한 배열을 리턴.
테스트 → int[] arr = {3, 7, 2, 5, 4};
 arr = insertElementToArray(arr, 2, 10);
 // arr 출력해서, [3, 7, 10, 2, 5, 4]로 출력되는지 체크!

③ 메서드 deleteElementsFromArray(____,_____) : 파라미터#1로 전달된 정수형 배열에서
파라미터#2(=삭제할 값) 값을 삭제한 배열을 리턴. (단, 해당하는 값이 여러 개 있으면 해당하는 값 모두를 삭제하세요.)
테스트 → int[] arr = {3, 7, 2, 2, 4, 2};
 arr = deleteElementsFromArray(arr, 2);
 // arr 출력해서, [3, 7, 4]로 출력되는지 체크!
 * 
 * 
 */
public class Q1908 {
	
	
	static int[] deleteElementsFromArray(int[] arr,int num) {
		
		int cnt=0;
		int[] arr_copy=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			arr_copy[i]=arr[i];
			if(arr_copy[i]==num) {
				arr_copy[i]=0;
				cnt++;
			}
			
		}
		
		int[] arr_delet=new int[arr.length-cnt];
		
		int j=0;
		for(int i=0;i<arr_copy.length;i++) {
				
				if(arr_copy[i]!=0) {
				
				arr_delet[j]=arr_copy[i];
				j++;
				}
				
			}	
				
			
			
			
		
		
		return arr_delet;
	}
	
	
	static int[] insertElementToArray(int[] arr,int row,int num) {
		
		
		int[] arr_insert=new int[arr.length+1];
		
		for(int i=0;i<arr_insert.length;i++) {
			
			
			arr_insert[i]=arr[i];
			if(i==row) {
				
				arr_insert[i]=num;
				break;
			}
			
			
		}
		
		for(int i=arr_insert.length-1-row;i<arr_insert.length;i++) {
			
			arr_insert[i]=arr[i-1];
			
			
		}
		
		return arr_insert;
	} 
	
	
	
	static int[] reverseArray(int[]arr) {
		
		int[] arr_r=new int[5];
		
		for(int i=0;i<arr_r.length;i++) {
			
			arr_r[i]=arr[arr.length-1-i];
			
		}
		
		return arr_r;
	}
	
	public static void main(String[] args) {
		int[] arr= {3, 2, 2, 2, 4};
		
		
		int[] arr1=reverseArray(arr);
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2=insertElementToArray(arr,2,10);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3=deleteElementsFromArray(arr,2);
		System.out.println(Arrays.toString(arr3));
	}
}
