package day19;
/*
 * Q1705.	두 개의 파라미터로 int형 배열 2개(arr1, arr2)를 받아서,
	두 배열이 완전히 같은지 여부를 리턴하는 메서드 equals() 를 작성해 보세요.
		static boolean equals(int[] arr1, int[] arr2)
	(실행결과의 예) 배열 arr1 : [3, 2, 4, 5, 1]   <-- 그냥 이렇게 배열을 만들어서 arr1 이라 하세요.
			배열 arr2 : [3, 2, 4, 5, 1]   <-- 그냥 이렇게 배열을 만들어서 arr2 라 하세요. 
			같음.
	(실행결과의 예) 배열 arr1 : [3, 2, 4, 5, 1]
			배열 arr2 : [3, 2, 4, 5]
			다름.
	(실행결과의 예) 배열 arr1 : [3, 2, 4, 50]
			배열 arr2 : [3, 2, 4, 5]
			다름.
 * 
 * 
 */
public class Q1905 {
	
	static boolean equal(int[] arr1, int[] arr2) {
		
		if(arr1.length==arr2.length) {
		for(int i=0;i<arr1.length;i++) {
			
			if(arr1[i]!=arr2[i])
				return false;
			
		}
		return true;
		
		}else
			return false;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr1= {3,2,4,5,1};
		int[] arr2= {3,2,4,5};
		
		boolean check=equal(arr1,arr2);
		
		if(check)
			System.out.println("배열은 같습니다");
		else
			System.out.println("배열은 다릅니다");
		
		
	}
}
