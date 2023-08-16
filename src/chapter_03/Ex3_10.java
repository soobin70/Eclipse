package chapter_03;

public class Ex3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char ch = 'A';
		
		char lowerCase = ('A'<=ch&&ch<='Z')?(char)(ch+32):ch;
		
		System.out.println("upperCase:"+ch);
		System.out.println("lowerCaser:"+lowerCase);

	}

}
