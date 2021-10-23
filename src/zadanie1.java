import java.util.Scanner;

public class zadanie1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj średnicę okręgu");
        float srednica = scan.nextFloat();

        double wynik = 2 * Math.PI * (srednica / 2);

        System.out.println("Obwód okręgu wynosi: " + wynik);


    }
}
