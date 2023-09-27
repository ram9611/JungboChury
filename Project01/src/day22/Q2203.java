package day22;

import java.util.Scanner;

/*
 * 클래스 rectangle 아래와 같이 정의해보고, 주어진 실행결과와 같이 실행되도록 main() 정의
 * -변수: int w = 밑변
 * 		 int h = 높이
 * -메서드: double area() = 넓이를 계산해서 리턴
 * 
 * main() :
 * -Scanner 객체를 사용해서 입력 받고
 * -Rectangle 객체를 생성하고
 * -이 객체의 area() 호출하여 아래와 같이 출력
 * 
 * (실행결과의 예) 
 * 밑변 입력 : 10
 * 높이 입력 : 5
 * 사각형 넓이 : 50
 * 
 */
class Rectangle{
	int w,h;
	Rectangle(int n1, int n2){
		w = n1;
		h = n2;
	}
	double area() {
		return w*h;
	}
}
public class Q2203 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변입력: ");
		int w = sc.nextInt();
		System.out.print("높이입력: ");
		int h = sc.nextInt();
		
		Rectangle r1 = new Rectangle(w,h);
		System.out.println("사각형의 넓이: "+(int)(r1.area()));
	}
}
