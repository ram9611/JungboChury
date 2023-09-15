package day12;
/*
 * 최소값 구하기
 * 두번째로 큰 값
 * 
 */
public class Ex1201 {
	public static void main(String[] args) {
		
		int[] arr=new int[] {12,54,1,35,4,12};
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			// max vs arr[i]
			if(max<arr[i]) {
				max=arr[i];
			}
			
			if(min>arr[i]) {
				min=arr[i];
			}
			
			
		}
		
		System.out.println("최대값 : "+max);
		System.out.println("최대값 : "+min);
		
		for
		
	}
}
