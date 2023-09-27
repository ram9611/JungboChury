package day22;
/*
 * Q2001. 클래스 Numbers 와 main() 을 아래와 같이 정의하세요.
	- 변수 : int num1, num2
	- 메서드 : void show()  --> 출력: "num1:__, num2:__"

main()에서,
	Numbers numbers = new Numbers();
	numbers.num1 = 5;
	numbers.num2 = 3;
	numbers.show();    // num1:5, num2:3




 * 
 */

class Numbers{
	int num1, num2;
	void show() {
		System.out.println("num1:"+num1+" num2:"+num2);
	}
}

public class Q2201 {
	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		numbers.num1 = 5;
		numbers.num2 = 3;
		numbers.show();
	}
}
