import java.util.Scanner;
import java.lang.Math; 

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = Math.random() * 10;
         double m = (n + x/n) / 2 ;
         n = m;
        while (m < n + 0.001 && m > n - 0.001) {
             m = (n + x/n) / 2 ;
             n = m;
        }
        return n;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int num = x;
        for (int i = 1; i < x; i ++) {
            num = num * (x-i);
        }
        return num;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        
        return -1;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(factorial(7));
        System.out.println(babylonian(121));
        scan.close();
    }
}
