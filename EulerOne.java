//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.


public class EulerOne{
	
	public static void main(String[] args){
		new EulerOne().run();
	}
	
	public void run(){
		//Variables:
		int totalSum = 0;
		
		for(int i = 0; i < 1000; i++){
			if(i % 3 == 0 || i % 5 == 0){
				totalSum = totalSum + i;
				System.out.println("Did it at " + i);
			}
			
		}
		System.out.println("the answer is " + totalSum);
	}
	
}