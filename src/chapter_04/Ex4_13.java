package chapter_04;

public class Ex4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "12o34"; 
		 char ch = ' '; 
		 boolean isNumber = true; 
		 
		 for(int i=0; i < value.length() ;i++) { 
		ch = value.charAt(i);
		if(!('0'<=ch && ch<='9')) {
		isNumber = false;
		break;
		}
		 } 
		 if (isNumber) { 
		 System.out.println(value+"는 숫자입니다."); 
		 } else { 
		 System.out.println(value+"는 숫자가 아닙니다."); 

	}
	}
}
