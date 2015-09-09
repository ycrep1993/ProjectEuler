import java.util.Arrays;

/**
 * Created by Percy on 8-9-2015.
 */

public class Euler010 {
    public static void main(String[] args){
        new Euler010().run();
    }

    public void run(){
        boolean[] arr = new boolean[2000000];

        Arrays.fill(arr, true);

        arr[0] = false;
        arr[1] = false;

        long antwoord = 0;

        for(int i = 3; i < 2000000; i++){
            //System.out.println("loopje 1 " + i);
            if(arr[i]){
                arr[i] = isPrime(i);
                for(int n = 2; n*i < 2000000; n++){
                    //System.out.println(n + "" + i);
                    arr[n*i] = false;
                }
            }
        }

        for(int i = 0; i < 2000000; i++){
            if(arr[i]){
                antwoord = antwoord + i;
            }
        }

        System.out.println(antwoord);
    }

    public boolean isPrime(int number){
        if(number==2) return true;
        if(number%2==0) return false;
        for(int i = 3; i*i <= number; i+=2){
            if(number % i == 0) return false;
        }
        return true;
    }
}