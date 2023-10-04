package day23;

// point 객체를 다루는 배열

public class Ex2302 {
	public static void main(String[] args) {
		point[] arr = new point[3];
		arr[0] = new point(1,1);
		arr[1] = new point(4,3);
		arr[2] = new point(11,11);
		
		for(int i=0;i<arr.length;i++) {
			arr[i].showInfo();
		}
		
	}
}
