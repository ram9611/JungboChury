package day20;
/*
 * 재귀호출(Recursive Call)
 * -그 자체로서 고급
 * -처음에는 '분석'만이라도.
 * 
 * method 실행-->s.f. 하나 만들어짐(push)
 * method 종료-->s.f. 하나 없어짐(pop)
 * 
 * 
 */
public class Ex2001 {
	static void m() {
		System.out.println("m.");
		m();//stack overflow 발생, 재귀호출(recursive call)
	}
	public static void main(String[] args) {
			//int num = 5; // 지역변수
			m();
		}
}
