package day12;
/*
 * Q1206.	난수 발생(-5~+5)한 값을 
	크기가 6인 배열에 채운 후
	1) 배열의 내용을 출력 (단, Arrays.toString() 사용 금지)
	2) 정수 하나(변수 n) 입력받고, 그 값이 이 배열에 존재하는지 여부를 출력.
	(실행결과의 예) 배열 : [-2, 3, 4, 4, -5, -1]
			n 입력 : 3 (엔터)
			-> 3 있음!
	(실행결과의 예) 배열 : [2, 0, -4, -4, 5, 3]
			n 입력 : 4 (엔터)
			-> 4 없음!
 * 
 */
public class Q1206 {
	public static void main(String[] args) {
		
		int[] arr=new int[6];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=(int)(Math.random()*10)-5;
			
			System.out.print(arr[i]+" ");
		}
		
		
	}
}
