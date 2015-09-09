import java.util.Arrays;

/**
 * Created by Percy on 8-9-2015.
 */
public class Euler10Erastosthenes {
    public static void main(String[] args){
        new Euler10Erastosthenes().run();
    }

    public void run(){
        boolean[] array = new boolean[2000000];
        Arrays.fill(array, Boolean.TRUE);
        array[0] = false;
        array[1] = false;
        int uitkomst = 0;
        int counter = 0;

        for(int i = 2; i < (int) Math.sqrt(2000000); i++){
            //System.out.println(i);
            if(array[i]){
                for(int j = i*i; j < 2000000; j = ((i*i)+(counter * i))){
                    array[j] = false;
                    //System.out.println(j);
                    counter++;
                }
            }
        }

        System.out.println("Priemgetallen berekend");

        for(int i = 0; i < 2000000; i++){
            System.out.println("i bij uitkomst " + i);
            if(array[i]){
                uitkomst = i;
                System.out.println("uitkomst " + uitkomst);
            }
        }
    }
}
