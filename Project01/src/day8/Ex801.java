package day8;
/*
 * 소수(prime number) 구하기
 * 
 */
public class Ex801 {
	public static void main(String[] args) {
		
		int num=7; // 정수 7 입력
		int cnt=0; // for문에서 if문 true시 카운트될 정수 선언 및 초기화
		
		for(int i=1;i<=num;i++) { // for문 i를 통해 반복되는 1~7
			
			if(num%i==0) { // 7%1~7 수행시 0이 된다면 true, cnt 카운트 수행
				cnt++;
			}
			
			
		}
		
		if(cnt==2) // 카운트 두번 수행됐다면 소수, 아니라면 소수가 아님
			System.out.println("소수임");
		else
			System.out.println("소수가 아님");
		
		
	}
}
