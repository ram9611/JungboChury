package day8;
/*
 * 1~100까지 정수 중 홀수만 출력
 * 
 * 
 */
public class Q804 {
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) { //for문을 통해 1~100까지 반복
			
			
			if(i%2!=0)// if문 조건 true시 출력 수행 : 2와 나머지 연산 수행시 0이 아니라면 true
				System.out.println(i+" ");
			
		}
		
		
	}
}
