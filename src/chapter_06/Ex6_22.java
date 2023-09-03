package chapter_06;

public class Ex6_22 {
	 static boolean isNumber(String str){
		 if(str==null||str=="") {
			 return false;
		 }
		 boolean st = true;
		 for(int i=0; i<str.length(); i++) {
			 if(!('0'<=str.charAt(i)&&str.charAt(i)<='9')) {
				  st = false;
				  break;
			 }
	 }return st;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));

	}

}
