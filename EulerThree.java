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