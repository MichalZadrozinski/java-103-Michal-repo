import java.util.Scanner;

public class zadanie6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        double sum = 0;
        for (int i = 1; i <number ; i++) {
            sum = sum + (1/(double)i);

        }
        System.out.println(sum);
    }
}