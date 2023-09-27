package day21;

import java.util.Scanner;

/*
 * Ex1905. 연습) class Circle.
(실행결과의 예) 반지름 값을 입력 : 10 (엔터)
		반지름이 10인 원의 넓이는 314.0 입니다.  // pi(파이) = 3.14, Math.PI
	- class Circle
		변수 : int r (반지름)
		메서드 : showArea() --> 출력 : "반지름이 __인 원의 넓이는 __ 입니다."
	- main():
		- 스캐너 --> 반지름 값(정수) 입력
		- Circle 객체를 생성 --> 반지름 값을 객체에 잘 담고.
		- 이 원의 넓이를 만들어놓은 메서드 호출해서 출력해보세요.

 * 
 */
class circle{
	int r;
	void showArea() {
		System.out.println("반지름이 "+r+"인 원의 넓이는 "+r*r*Math.PI+"입니다");
	}
}

public class Ex2105 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		circle c1 = new circle();
		System.out.print("반지름 값(정수) 입력: ");
		c1.r=sc.nextInt();
		c1.showArea();
	}
}
