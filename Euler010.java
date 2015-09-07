/**
 * Created by Percy on 7-9-2015.
 */
public class Euler010 {
    public static void main(String[] args){
        new Euler010().run();
    }

    public void run(){
        long antwoord = 0;
        for(int i = 3; i < 2000000; i+=2){
            System.out.println("run");
            if(isPrime(i)){
                antwoord = antwoord+i;
                //System.out.print(i+",");
            }
        }
        antwoord = antwoord+2;
        System.out.println(antwoord);
    }

    public boolean isPrime(int number){
        for(int i = 3; i < number; i+= 2){
            //System.out.println("isprime");
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
