package day23;
/*
 * -this 키워드 : 객체 자기자신의 참조값 (암기)
 * -(추가) : p1.dist(p2); p2.dist(p1)
 * 
 */
class DistCalculator{
	double calculateDis(point p1, point p2){
		int dx = p1.x-p2.x;
		int dy = p1.y-p2.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
}
class point{
	int x,y;
	
	point(int x, int y){ //생성자: 멤버변수 초기화
		this.x=x;
		this.y=y;
	}
	
	double dist(point p) {
		//(x,y)~(p.x, p.y)
		int x1 = p.x;
		int y1 = p.y;
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	}
	
	void showInfo() {
		System.out.println("("+x+","+y+")");
	}
	
}
public class Ex2301 {
	public static void main(String[] args) {
		point p1 = new point(1,1);
		point p2 = new point(5,3);
		DistCalculator obj = new DistCalculator();
		
		
		System.out.println("거리: "+obj.calculateDis(p1,p2));
		
		//System.out.println("거리: "+p1.dist(p2));
		//System.out.println("거리: "+p2.dist(p1));
	}
}
