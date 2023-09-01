package day4;
/*
 * 연습. (삼항연산자를 사용해서, 3개의 정수 중 가장 큰 값을 출력)
 * 
 * 
 * [고급] 연습:
 * 정수 입력 : 15327
 * 거꾸로 : 72351
 * 모든 자리수의 합: 18
 */

public class Q403 {
	public static void main(String[] args) {
		
		int a=17;
		int b=25;
		int c=8;
		
		int max=(b>a?b:a>c?a:c);
		System.out.println(max);
		
		System.out.println("===========");
		
		int num=0;
		String s="15327";
		String revers="";
		
		
		for(int i=s.length()-1;i>=0;i--) {
			revers+=s.charAt(i);
			System.out.println(s.charAt(i));
			num+=(int)s.charAt(i)-'0';
		}
		
		
		System.out.println(revers);
		System.out.println(num);
		
	}
}
