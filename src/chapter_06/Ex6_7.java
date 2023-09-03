package chapter_06;

class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	double getDistance(int x1, int y1) {
		return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
	}
	
}

public class Ex6_7 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		// p(1,1)과 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2, 2));

	}

}
