//find x raised to the power y.
//Two no. are entered through the keyboard . WTP to find the value of one no. raised to the power of another.(Do no use java built-in-method)

import java.util.Scanner;
public class Power {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 1;

        for(int i = 0; i<b; i++){
            result *= a;

        }
        System.out.println(result);

    }
    
}
