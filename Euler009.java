/**
 * Created by Percy on 7-9-2015.
 */
public class Euler009 {
    public static void main(String[] args){
        new Euler009().run();
    }

    public void run(){
        // a² * b² = c² and a + b + c = 1000
        for(int a = 1; a < 1000; a++){
            for(int b = 1; b < 1000; b++){
                int c = 1000 - a - b;
                if(a*a+b*b==c*c){
                    System.out.println(a*b*c);
                }
            }
        }
    }
}
