package chapter_03;

public class Ex3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		byte b = 20;
		byte c =(byte)( a + b);
		
		char ch = 'A';
		ch =(char)(ch+2);
		
		float f = (float)3/2;
		long l = 3000*3000*3000L;
		
		float f2 = 0.1f;
		double d = 0.1f;
		
		boolean result = d==f2;
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);

	}

}
