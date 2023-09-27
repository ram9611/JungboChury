package day22;

import java.util.Scanner;

/*
 * 
Q2002.	클래스 Circle을 아래와 같이 정의해보고, 
	주어진 실행결과와 같이 실행되도록 main()을 작성해 보세요.

	- 변수 : r = 반지름 (정수형)
		 x = 중심점의 x좌표 (정수형)
		 y = 중심점의 y좌표 (정수형)
	- 메서드 : area() = 넓이를 계산해서 리턴

	main()	:
		- 반지름이 5 이고 중심점의 좌표가 (1,1) 인 원 객체를 생성
		- 출력
	(실행결과)
		반지름이 5이고 중심점의 좌표가 (1,1)인 원(넓이:__________)입니다.

 * 
 */
class Circle{
	int x;
	int y;
	int r;
	Circle(int n1, int n2, int n3){
		x = n1;
		y = n2;
		r = n3;
	}
	double area() {
		return r*r*Math.PI;
	}
}

public class Q2202 {
	public static void main(String[] args) {
		Circle c = new Circle(1,1,5);
		System.out.println("반지름이 "+c.r+"이고 중심점의 좌표가 ("+c.x+","+c.y+")인 원(넓이:"+c.area()+")입니다.");
	}
}
