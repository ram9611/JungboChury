package day8;
/*
 * 
 * 1부터 100까지의 정수 중 일의 자리가 3, 6, 또는 9인 수를 출력.
 * 
 */
public class Q807 {
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) { // 1~100 정수 선언
			
			if(i%10==3||i%10==6||i%10==9) // if문 true시 출력 수행 : 1~100중 10으로 나머지 연산결과 3또는 6또는 9 출력 된다면 true
				System.out.println(i);
			
		}
		
	}
}
