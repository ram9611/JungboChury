package day14;

import java.util.Arrays;

/*
 * 참고)	Arrays.clone() : 배열을 '복제' 합니다.
	- 추가공부(하실 분들만) : shallow-copy 와 deep-copy 에 대해서 (구글 블로그 검색)
	- Arrays.clone() 은 shallow-copy 합니다.
	
	다양한 멤버 변수들을 가진 클래스 box이다.
	객체를 설계하는 것이 클래스이며, 클래스를 실제로 컴퓨터 메모리에 할당하는 것이 인스턴스화이다.
	
	
	shallow-copy:
	얕은 복사는 원본 객체 A와 복사 객체 B가 하나의 할당받은 영역으로 지정하여 원본 객체 A가 변경되는 경우,
	종속되어 있는 복사 객체 B도 똑같은 메모리 상의 영역을 참조하고 있기 때문에 값이 종속적으로 변한다.
	[code]
	int arr1[] = {1, 2, 3, 4, 5};
    int arr2[] = arr1;
     
    deep-copy:
    A 객체에 있는 모든 내용을 복사하여 새로운 영역에 있는 B 객체를 할당해 준 것이다. 이때 A와 B는 다른 메모리 영역에 존재하므로, 
       원본 객체 A가 수정되어도 B 객체의 값에는 변화가 없다.
    [code]
    int arr1[] = {5, 4, 3, 2, 1};
    int arr2[] = arr1.clone();



4)	위의 참고를 이해하신 분들만:
	배열을 '복제'한 후 두 배열이 같은지 확인 (단, Arrays.clone() 사용 금지)
			※두 배열의 모든 요소에 대해 arr1[i] == arr2[i] 로 확인.
	(실행결과)	arr1 : [12, 57, 33, -1]
				arr2 : [12, 57, 33, -1]
			arr1과 arr2를 비교 : 같음
			※ 배열의 '복제' : 그러니까 새로운 배열을 생성하여
					 모든 요소를 복사해 넣으라는 겁니다
			※ 두 배열이 '같은지' 비교 : 그러니까 두 배열 안에 있는
					모든 요소가 같은지 비교하라는 겁니다
 * 
 * 
 */
public class Q1404 {
	public static void main(String[] args) {
		
		int[] arr1= {12,57,33,-1};
		int[] arr2=arr1;
		
		System.out.println("arr1 : "+Arrays.toString(arr1));
		System.out.println("arr2 : "+Arrays.toString(arr2));
		
		boolean found=false;
		for(int i=0;i<arr1.length;i++) {
			
			if(arr1[i]!=arr2[i])
				found=true;
			
		}
		
		
		if(found)
			System.out.println("arr1과 arr2를 비교 : 다름");
		else
			System.out.println("arr1과 arr2를 비교 : 같음");
		
	}
}
