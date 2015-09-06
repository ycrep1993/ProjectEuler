/**
 * Created by Percy on 6-9-2015.
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class EulerSeven {

    public static void main(String[] args){
        new EulerSeven().run();
    }

    public void run(){
        int antwoord = 0;
        int i = 2;
        int counter = 0;

        while(counter != 10001){
            if(isPrime(i)){
                antwoord = i;
                counter++;
            }
            i++;
        }
        System.out.println(antwoord);
    }

    public boolean isPrime(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

}
