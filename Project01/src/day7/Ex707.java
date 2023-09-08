package day7;
/*
 * 
 * 
 * 
 * 
 */
public class Ex707 {
	public static void main(String[] args) {
		
		for(int i=1; i<=7;i++) {
			System.out.println(i+" "); //기존의 코드를 건들지말고 1234만 출력되게 하라
			if(i==4) {
				break; //반복문을 빠져나간다.
			}
		}
		
		
		for(int i=1;i<=7;i++) {
			//i가 4라면 스킵해라....
			if(i==4) {
				continue; //다음 반복회차로 이동.
			}
			System.out.println(i+" ");
		}
		
	}
}
