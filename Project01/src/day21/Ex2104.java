package day21;

class point {
	int x;
	int y;
	String getString() {
		return "("+x+","+y+")";
	}
	double dist(int x2, int y2) {
		//(x,y)~(x2,y2)
		int dx = x - x2;
		int dy = y - y2;
		return Math.sqrt(dx*dx + dy*dy);
	}
}

public class Ex2104 {
	public static void main(String[] args) {
		point p1; // point 객체를 가리킬 수 있는 참조 변수 p1의 선언
		p1 = new point(); // point 객체를 생성해서 참조변수 p1과 연결
		p1.x = 1;
		p1.y = 1;
		
		point p2 = new point();
		p2.x = 5;
		p2.y = 4;
		
		//System.out.println("점#1 : ("+p1.x+","+p1.y+")");
		//System.out.println("점#2 : ("+p2.x+","+p2.y+")");
		System.out.println("점#1 : "+p1.getString());
		System.out.println("점#1 : "+p2.getString());
		System.out.println("거리: "+p1.dist(p2.x, p2.y));
		System.out.println("거리: "+p2.dist(p1.x, p1.y));
	}
}
