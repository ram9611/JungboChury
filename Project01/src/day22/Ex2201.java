package day22;
/*
 * [정리]
 * 생성자
 * 1)리턴타입 없이
 * 2)이름은 클래스 이름과 동일하게
 * 3)return문 쓸 수 없음
 * 
 * 생성자의 역할
 * -객체 생성 직후에 호출되어서 빈 그릇의 초기화
 * -Not 객체 생성
 * 
 */
class Point{
	int x,y;
	Point(int p1, int p2) { // 생성자(constructor)
		x = p1;
		y = p2;
	}
	void show() {
		System.out.println("x:"+x+" y:"+y);
	}
}

public class Ex2201 {
	public static void main(String[] args) {
		Point p1 = new Point(5,4);
	//	p1.x=5;
	//	p1.y=3;
		p1.show();
	}
}
