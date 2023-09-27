package day22;
/*
 * 
Q2006.	클래스 Car를 정의하고, main()을 작성해서 아래와 같은 실행결과가 되도록 해보세요.

	class Car :
	- 변수 : int plate  // 번호판
	 	String color  // 차량 색상
		String model  // 차량 모델명
	- 생성자 : (하지 마세요. 아무런 일도.)
	- 메서드 : void setPlate(______)   // 파라미터의 값을 변수 plate에 대입
		   void setColor(______)   // 파라미터의 값을 변수 color에 대입
		   void setModel(______)   // 파라미터의 값을 변수 model에 대입
		   void showCar()   // 출력 : "Car객체: 모델A(blue), 1234번 차량"

	main()에서,
	- Car 객체를 3개 생성한 후 각 set______() 메서드들을 사용하여 아래와 같이 각 변수 값들을 셋팅하고 출력.
		(객체1) 1234, "blue", "모델A"
		(객체2) 5678, "white", "모델B"
		(객체3) 9012, "red", "모델C"
	
	(실행결과)
		Car객체: 모델A(blue), 1234번 차량
		Car객체: 모델B(white), 5678번 차량
		Car객체: 모델C(red), 9012번 차량
 */
class Car{
	int plate;
	String color;
	String model;
	
	void setPlate(int n) {
		this.plate = n;
	}
	void setColor(String s) {
		this.color = s;
	}
	void setModel(String s) {
		this.model = s;
	}
	void showCar() {
		System.out.println("Car객체: "+model+"("+color+")"+", "+plate+"번 차량");
	}
}
public class Q2206 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.setColor("blue");
		car2.setColor("white");
		car3.setColor("red");
		
		car1.setModel("모델A");
		car2.setModel("모델B");
		car3.setModel("모델C");
		
		car1.setPlate(1234);
		car2.setPlate(5678);
		car3.setPlate(9012);
		
		car1.showCar();
		car2.showCar();
		car3.showCar();
	}
}
