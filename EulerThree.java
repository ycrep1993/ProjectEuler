//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?


public class EulerThree{
	
	public static void main(String[] args){
		new EulerThree().run();
	}
	
	public void run(){
		
		for(long i = 2; i < 600851475143L; i++){
			if(isPrime(i)){
				if(isPrimeFactor(i)){
					System.out.println(i);
				}
			}
		}
		
		
	}
	
	public static boolean isPrime(long number){
		
		for(long i = 2; i < number; i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrimeFactor(long number){
		if(600851475143L % number == 0){
			return true;
		}
		return false;
	}
}