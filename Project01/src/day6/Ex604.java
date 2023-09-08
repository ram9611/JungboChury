package day6;
/*
 * 
 * 
 */
public class Ex604 {
	public static void main(String[] args) {
		// 연습. 1~100 정수들 중 2의 배수, 3의 배수, 7의 배수 출력
		
		for(int i=1;i<=100;i++) {
			if(i%2==0||i%3==0||i%7==0)
				System.out.println(i);
			
		}
	}
}
