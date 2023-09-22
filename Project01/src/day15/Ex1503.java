package day15;
/*
 * 
 * 가변 배열
 * 
 */
public class Ex1503 {
	public static void main(String[] args) {
		
		int[][] arr= {
				
				{1,2,3},	
				{4,5,6,7},
				{8,9}
		};
		
		for(int i=0;i<arr.length;i++) { //arr.length : 행의 크기
			
			for(int j=0;j<arr[i].length;j++) { //arr[i].length :행#i의 크기
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
