/**
 * Created by Percy on 6-9-2015.
 * The sum of the squares of the first ten natural numbers is,
 * 1² + 2² + ... + 10² = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)² = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 ? 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class Euler006 {
    public static void main(String[] args){
        new Euler006().run();
    }

    public void run(){
        //Sum of the squares
        int sumOfSquares = 0;
        for(int i = 0; i<=100; i++){
            sumOfSquares = sumOfSquares + (i*i);
        }
        System.out.println("The sum of the squares is: " + sumOfSquares);

        //Square of the sums
        int squareOfSums = 0;
        for(int i = 0; i<=100; i++){
            squareOfSums = squareOfSums + i;
        }
        squareOfSums = squareOfSums * squareOfSums;

        System.out.println("The square of the sums is: " + squareOfSums);

        System.out.println("The solution is: " + (squareOfSums - sumOfSquares));
    }
}
