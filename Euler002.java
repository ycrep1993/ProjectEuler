public class Euler002 {
	
	public static void main(String[] args){
		new Euler002().run();
	}
	
	public void run(){
		int totalSum = 0;
		int fibboNext = 1;
		int fibboCurrent = 0;
		int fibboPrev = 1;
		
		while(fibboCurrent < 4000000){
			System.out.println(fibboCurrent);
			fibboNext = fibboPrev + fibboCurrent;
			fibboPrev = fibboCurrent;
			fibboCurrent = fibboNext;
			
			if(fibboCurrent % 2 == 0){
				totalSum = totalSum + fibboCurrent;
				System.out.println("Total: " + totalSum);
			}
		}
		
	}
	
}