package day19;
/*
 * 고급3.
[완전제곱수(perfect square number)인지 여부를 판단하는 isPerfectSquare(int num) 메서드] 를 정의하고 (num이 완전제곱수 이면 true를, 아니면 false를 리턴),
[a부터 b까지의 정수 중 완전제곱수를 모두 출력하는 showPerfectSquares(int a, int b) 메서드] 를 정의한 후,

아래와 같이 main()을 실행한 결과 완전제곱수(1 4 9 16 25 36 …)가 출력되도록 코드를 작성하세요.
(완전제곱수는 1, 4, 9, 16, 25, 36, … 등과 같이 정수의 제곱에 해당하는 수)

main() :
	showPerfectSquares(1, 100); // 1부터 100까지 정수 중 완전제곱수를 출력.

 * 
 */
public class Q1909 {
	
	static void showPerfectSquares(int a, int b) {
		
		int i=a;
		while(true) {
			if(i*i>100)
				break;
			
			System.out.print(i*i+" ");
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		
		showPerfectSquares(1, 100);
		
	}
}
