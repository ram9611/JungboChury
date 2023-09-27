package day22;
/*
 * 디폴트 생성자(default constructor)-->기본 생성자
 * 객체가 생성된 직후에 자동으로 호출되는 일종의 메서드 = 생성자
 * 즉, 생성자는 객체를 생성하면 생성 직후에 반드시 자동으로 호출됨
 * 디폴트 생성자 : 개발자가 생성자를 작성하지 않으면 (자바가) 자동으로 끼워 넣어주는 생성자.
 */
class A{
	int num
	A(int n){
		num=n;
	}
	//A() { }
}
class B{
	int num;
	//b() {}
}
public class Ex2202 {
	public static void main(String[] args) {
		//A a = new A(); - err
		B b = new B();
	}
}
