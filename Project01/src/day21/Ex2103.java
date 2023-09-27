package day21;

class Dog{
	String name;
	void bark() {
		System.out.println(name+"가 짖습니다. 멍멍!");
		}
	}

public class Ex2103 {
	public static void main(String[] args) {
		
		int num = 5;
		
		Dog dog1 = new Dog(); // Dog 객체 생성 문장. / dog1 : 참조변수
		dog1.name = "장군이";
		
		Dog dog2 = new Dog(); // Dog 객체 생성 문장. / dog2 : 참조변수
		dog2.name = "콩떡이";
		
		dog1.bark();
	}
}
