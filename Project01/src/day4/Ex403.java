package day4;
/*
 * 연산자의 우선 순위
 * 
 * 논리연산자 : && || ! ^
 * 		--->true와 false에 대한 연산
 * 비트연산자: & | ~ ^
 * 		--->1,0에 대한 연산
 * 
 * [1] && (and연산자) : 둘 다 true여야만 true.
 * 	ex)syso(true&&true); //true
 *  ex)int num =10; syso(5<num && num<15); //true
 *  ex) 조건식, "num이 짝수이고 0보다 크면 true"
 *  	syso(num%2==0 && num>0);
 *  
 *  [2] & (AND 연산자) : 둘 다 1이어야만 1.
 *  	ex) syso(ob0001 & ob0011); //1
 *  
 *  [3] || (or연산자) : 둘 중 하나라도 true이면 true.
 *  	ex) syso(true||false); //true
 *  		syso(true||true); //true
 *  	ex) int num=10;			평가(evaluation)
 *  		syso(num>=10 || num%2==0); //true --->S.C.E.
 *  	(조건식)"num이 홀수이거나 5이상이면 true" syso()
 *   	(조건식)"num이 0보다 작거나 같다면 true"
 *   
 *   [4] |(OR연산자) : 둘 중에 하나라도 1이면 1
 *   	ex) syso(1|3); // 3 (이해)
 *   	ex) syso(ob0001 | ob0011);
 *   
 *   [5]! (NOT연산자) : 뒤집.
 *   	ex) syso(!false); // true
 *   		syso(!true); // false
 *   	ex) int num=10;
 *   		syso(num<=5||num>=15); //false
 *   		syso(!(num<=5||num>=15)); //true 이해
 *   	ex) syso(num%2==0); //num이 짝수냐?
 *   		syso(!(num%2==0)) //num이 홀수냐?
 *   
 *   (조건식) num이 10보다 작으면서, 2또는 3또는 7이 아니라면 true
 *   --->num<10 && (num!=2 && num!=3 &&num!=7)
 *   --->num<10 && !(num==2 || num==3 || num==7)
 *   		-"드 모르간 법칙" : 각 조건을 부정하고, and->or(or->and)하고, 다시 전체를 부정하는 것은 원래의 조건과 같다.
 *   
 *   [6]~(Not 연산자) : 뒤집(1->0, 0->1)
 *   [7]^(XOR연산자) : 둘이 다르면 true, 같으면 false
 *   		ex)syso(true^false); //true
 *   		ex)syso(false^false) // false
 *   
 *   [8]^: 둘이 달라야 1.
 *   		ex)syso(ob0001^ob0011); //2
 * 
 */
public class Ex403 {
	public static void main(String[] args) {
		
		int a=1, b=2, c=3;
		int x=a+b-2/2+c;
		int y=a+(b-2)/(2+c);
		
		System.out.println("x: "+x+" y: "+y);
	}
}
