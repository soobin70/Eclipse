package chapter_04;

public class Ex4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i = 1;
	      int sum = 0;
	      
	      while(true) {
	         if(i % 2 == 1) {
	            sum += i;
	         }
	         
	         else if(i % 2 == 0) {
	            sum += -i;
	         }
	         
	         if(sum >= 100)
	            break;
	         else
	            i++;
	      }
	     
	      System.out.println(i);
	   
	}
}
