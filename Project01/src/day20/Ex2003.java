package day20;
/*[정리]
 * .length() : 문자열의 길이를 리턴
 * .charAt() : 해당 인덱스(idx) 위치에 있는 문자를 리턴
 * .substring(a) 중요! : 인덱스가 a부터 시작해서 끝까지의 부분문자열.
 * .substring(a,b) 중요! : 인덱스가 a부터 시작해서 b가 되기 전까지의 부분문자열.
 * 
 */
public class Ex2003 {
	public static void main(String[] args) {
		String s = "문자열A";
		System.out.println("문자열의 길이 : "+s.length());
		
		char ch = s.charAt(0); // char ch = '문';
		System.out.println("두번째 글자 : "+ch);
		
		ch = s.charAt(s.length()-1);
		System.out.println("마지막 글자 : "+ch);
		
		String s2 = s.substring(1); // 1부터 시작해서 끝까지
		String s3 = s.substring(1,3); // 1부터 시작해서 3-1=2까지
	}
}
