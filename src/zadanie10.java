import java.util.Scanner;

public class zadanie10 {
    // Napisz program, który pobierze od użytkownika jedną liczbę dodatnią (typu int) i obliczy sumę cyfr podanej liczby.
    // Podpowiedź: aby rozpatrywać liczbę cyfra po cyfrze, możesz obliczać resztę z dzielenia liczby przez 10 (aby uzyskać wartość ostatniej cyfry)
    // i dzielić liczbę bez reszty przez 10 (żeby „przesuwać” się do kolejnej cyfry).

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę, aby obliczyć sumę cyfr ją tworzących");
        int number = scanner.nextInt();

        int result = 0;
        while (number != 0) {
            result += number % 10;
            number /= 10;
        }
        System.out.println("Suma cyfr podanej liczby wynosi: " + result);

    }

}
