import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {

        Scanner scanWeight = new Scanner(System.in);
        System.out.println("Jeśli chcesz obliczyć sowje BMI (Body Mass Index) to podaj swoją wagę w kilogramach");
        float weight = scanWeight.nextFloat();

        Scanner scanHeight = new Scanner(System.in);
        System.out.println("Dzięki. Teraz podaj swój wzrost w centymetrach");
        int height = scanHeight.nextInt();
        double doubleHeigh = (double) height / 100;

        double bmi = weight / (doubleHeigh * doubleHeigh);

        System.out.print("Twoje BMI wynosi " + bmi);
        if (bmi < 18.5 || bmi > 24.9)
            System.out.println("\t- BMI nieoptymalne");
        else System.out.println("\t- BMI optymalne");


    }
}
