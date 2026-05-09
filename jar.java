import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int N = 10; 
        int K = 5; 
        int candies = N;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > candies) {
            System.out.println("INVALID INPUT");
        } else {
            candies = candies - n;

            System.out.println("Number of Candies Sold: " + n);

            if (candies <= K) {
                candies = N;
            }

            System.out.println("Number of Candies available: " + candies);
        }
    }
}
