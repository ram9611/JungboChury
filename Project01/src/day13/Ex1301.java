package day13;
/*
 * 주사위 2개를 던져볼게요
 * 
 * 중복없이--> 먼저 뽑은 숫자와 비교
 * 			 boolean 타입의 배열을 사용
 */
public class Ex1301 {
	public static void main(String[] args) {
		
		
		boolean[] arr=new boolean[6];
		
		for(int i=1;i<=2;i++){
			
			int idx=(int)(Math.random()*5+1);
			
			if(arr[idx]) {
				i--;
				continue;
			}
			
			arr[idx]=true;
			
		}
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i])
				System.out.print(i+1+" ");
			
		}
		
	}
}
