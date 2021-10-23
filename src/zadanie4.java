import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {

        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Podaj dodatnią liczbę całkowitą");
        int number = scanNumber.nextInt();

        for (int i = 1; i <= number; i++) {
            if ((i % 3 == 0) && (i % 7 == 0)) {
                System.out.println("Pif paf");
            }
            if (i % 3 == 0){
                System.out.println("Pif");
            }
            else if (i % 7 == 0) {
                System.out.println("Paf");
            }
            else System.out.println(i);


        }

    }
}
