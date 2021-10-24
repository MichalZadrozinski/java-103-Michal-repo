import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz dodatnią liczbę całkowitą");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            int counter = 0;
            for (int j = i; j >= 1; j--) {
                    if (i % j == 0){
                        counter++;
                    }
                }
            if (counter == 2){
                System.out.println(i);
            }

            }
        }


            }


