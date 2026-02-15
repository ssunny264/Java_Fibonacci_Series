/*
 * Fibonacci Series
 */
package fibonacci;

import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Enter number up to which Fibonacci series is to print: ");
        int number = new Scanner(System.in).nextInt();
        
        System.out.println("Fibonacci series up to " + number + " numbers: ");
        
        for(int i=1; i<=number; i++) {
            System.out.println(fibonacci2(i) + " ");
        }
        
    }
    public static int fibonacci2(int number){
        if(number ==1 || number == 2){
            return 1;
        }
        int fib1=1, fib2=1, fibonacci=1;
        
        for(int i=3; i<=number; i++){
            fibonacci = fib1+fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }
        return fibonacci;
    }
}
