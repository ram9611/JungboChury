package day22;

import java.util.Scanner;

/*
 * Q2005.	클래스 Triangle을 아래와 같이 정의하고, main()도 작성해 보세요.
	- 변수 : 알아서.
	- 메서드 : 알아서.

	main():
		키보드로부터 밑변, 높이의 값을 정수로 입력 받아서, Triangle 객체를 생성하세요. 
		Triangle 객체 생성시 호출된 생성자에서 이 두 값(밑변, 높이)을 파라미터로 받아서 두 변수(밑변, 높이)의 값을 초기화하고, 
		Triangle 객체에 삼각형의 넓이를 리턴하는 메서드가 만들어지도록 클래스를 작성한 후, 
		main() 에서 이 메서드를 호출하여 삼각형의 넓이를 출력해보세요.

	(실행결과의 예)
		삼각형의 밑변 : 5 (엔터)
		삼각형의 높이 : 10 (엔터)
		밑변이 5, 높이가 10인 삼각형의 넓이는 25.0입니다.
 * 
 */
class Triangle{
	int w;
	int h;
	Triangle(int n1, int n2){
		w = n1;
		h = n2;
	}
	double getArea() {
		return w*h*0.5;
	}
}
public class Q2205 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 밑변: ");
		int w = sc.nextInt();
		System.out.print("삼각형의 높이: ");
		int h = sc.nextInt();
		
		Triangle tri1 = new Triangle(w,h);
		
		System.out.println("밑변이"+tri1.w+", 높이가 "+tri1.h+"인 삼각형의 넓이는"+ tri1.getArea() +"입니다");
	}
}
