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