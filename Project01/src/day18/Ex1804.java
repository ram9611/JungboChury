package day18;
/*
 * [정리]
 * 리턴문 : "return 리턴값;"
 * 	1)메서드를 실행 종료
 * 	2)리턴값을 '메서드를 호출한 쪽'으로 되돌려줌.
 * 
 * 
 */
import java.util.Arrays;

public class Ex1804 {
	
	static int[] makeArray() {
		
		int[] ret=new int[5];
		
		for(int i=0;i<ret.length;i++) {
			
			ret[i]=(int)(Math.random()*9+1);
			
		}
		
		
		return ret;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr=makeArray();
		System.out.println("arr: "+Arrays.toString(arr));
		
	}
}
