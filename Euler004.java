import java.lang.*;

public class Euler004 {
	
	public static void main(String[] args){
		new Euler004().run();
	}
	
	public void run(){
		int number = 0;
		int numberTwo = 0;
		
		for(int i = 999; i > 0; i--){
			for(int n = 999; n > 0; n--){
				number = i * n;
				if(isPalindrome(number)){
					if(number > numberTwo){
						numberTwo = number;
						System.out.println(i + " * " + n);
					}
				}
			}
		}
		System.out.println(numberTwo + "HEHE");
	}
	
	public static boolean isPalindrome(int number){
		String st = Integer.toString(number);
		
		String rev = new StringBuilder(st).reverse().toString();
		
		if(st.equals(rev)){
			return true;
		}
		return false;
	}
	
}