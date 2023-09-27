package day22;
/*
 * Q2004.	클래스 Circle2를 아래와 같이 정의해 보세요.
	- 변수 : int radius   // 반지름
	- 생성자 (없음)
	- 메서드 : void setRadius(int r)   // r을 radius에 대입
		   double getArea()        // 원의 넓이를 리턴
	main() :
		- Circle2 circle;
		- circle = new Circle2();
		- circle.setRadius(10);
		- sysout("원의 넓이 : " + circle.getArea());

	(실행결과)
		원의 넓이 : 314.0

 */
class Circle2{
	int radius;
	void setRadius(int r) {
		radius = r;
	}
	double getArea() {
		return radius*radius*3.14;
	}
}
public class Q2204 {
	public static void main(String[] args) {
		Circle2 c1 = new Circle2();
		c1.setRadius(5);
		System.out.println("원의 넓이는: "+c1.getArea());
	}
}
