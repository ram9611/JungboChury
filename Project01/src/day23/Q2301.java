package day23;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 3개의 정수를 저장하는 객체 ==> int[]

여러 개(?)의 정수를 저장하는 객체 ==> ArrayList 객체.
	Ex) ArrayList<>
		     ~~ -----> '제너릭' 클래스(Generic Class)
	Ex) ArrayList<int> (X) ---> 꺽쇠<> 안에 저장할 타입을.
	    ArrayList<Integer> (O)  그런데. 꺽쇠 안에는 클래스이름only.
				    그래서 int는 'Integer'

Ex) 내부평가대비 = 회원관리 / 상품관리 / 성적관리 / ...
		   --> (Ex. 성적관리)
			- 성적등록 기능
			- 전체 성적조회 기능
			- 성적검색 기능
			- 성적삭제 기능

- 내일 내부평가, 10:00~12:50 (이클립스 + 구글링 허용)
- 내일 내부평가대비(추가), 9:00~ (지각 X)
------------------------------------------------------
Q2101. 연습.
	-------------------
	1. 전체 숫자 조회
	2. 새로운 숫자 입력
	3. 숫자 검색
	4. 숫자 삭제
	0. 종료
	-------------------
	입력>

	(1. 선택시)
	38,12,27     ---> 입력된 숫자들을 출력.
	※ 만약 리스트의 길이가 0이면, "(입력된 숫자 없음)" 이라고 출력.

	(2. 선택시)
	새로운 정수 입력 : 17 (엔터)
	입력되었습니다.
	
	(3. 선택시)
	찾을 숫자 입력 : 17 (엔터)
	인덱스#3 = 17
	※ 만약 리스트에 없는 숫자(ex. 19) 입력시, "(19 없음)" 이라고 출력.

	(4. 선택시)
	삭제할 숫자 입력 : 17 (엔터)
	삭제되었습니다.
	※ 만약 리스트에 없는 숫자(ex. 19) 입력시, "(19 없음)" 이라고 출력.


 * 
 */
public class Q2301 {
	static ArrayList<Integer> list1 = new ArrayList<Integer>();
	static Scanner sc = new Scanner(System.in);
	
	static void showAll() {
		String s = "-------------------\n" + 
				"1. 전체 숫자 조회\n" + 
				"2. 새로운 숫자 입력\n" + 
				"3. 숫자 검색\n" + 
				"4. 숫자 삭제\n" + 
				"0. 종료\n" + 
				"-------------------\n" + 
				"입력>";
		System.out.print(s);
	}
	
	static void showlist() {
		if(list1.size()==0) {
			System.out.println("출력할 숫자가 없습니다.");
		}
		for(int i=0; i<list1.size();i++) {
			if(i==list1.size()-1) {
				System.out.println(list1.get(i));
				break;} 
			System.out.print(list1.get(i)+",");
		}
	}
	static void inputlist() {
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		list1.add(num);
		System.out.println("입력되었습니다.");
	}
	static void searchlist() {
		System.out.print("검색할 숫자입력: ");
		int num = sc.nextInt();
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i)==num) {
				System.out.println(num+"은 "+(i+1)+"에 존재합니다");
				break;
			}
			System.out.println(num+"은 존재하지않습니다");
				
		}
	}
	static void removelist() {
		showlist();
		System.out.print("제거할 숫자 입력: ");
		int num = sc.nextInt();
		for(int i=0;i<list1.size();i++) {
			if(num==list1.get(i)) {
				list1.remove(i);
			}
		}
		showlist();
	}
	public static void main(String[] args) {
		
		while(true) {
			showAll();
			int num = sc.nextInt();
			
			if(num==0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			switch(num) {
			case 1: showlist(); break;
			case 2: inputlist(); break;
			case 3: searchlist(); break;
			case 4: removelist(); break;
			}
			
		}
	}
}
