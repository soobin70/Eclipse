package chapter_06;

class Student1{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	Student1(String name,int ban, int no, int kor, int eng, int math){
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		
	}
	
	int getTotal(){
		
		return kor+eng+math;
	}
	float getAverage() {
		float avg = (float) getTotal()/3;
		return Math.round(avg*10)/10.0f;
	}
	String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
}


public class Ex6_5 {

	public static void main(String[] args) {
		Student1 s = new Student1("홍길동",1,1,100,60,76);
		System.out.println(s.info());
//		s.name = "홍길동";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;
//		System.out.println("이름:" + s.name);
//		System.out.println("총점:" + s.getTotal());
//		System.out.println("평균:" + s.getAverage());

	}

}
