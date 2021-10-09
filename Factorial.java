// WTP to find a factorial to a given no. enter to the keyboard?


import java.util.Scanner;

class Factorial {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}