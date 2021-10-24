import java.util.Scanner;

// Napisz program realizujący prosty kalkulator. Program powinien:
//a. pobrać pierwszą liczbę (typu float)
//b. pobrać jeden ze znaków: + - / *
//c. pobrać drugą liczbę (typu float)
//d. zwrócić wynik pobranego działania
//Jeśli użytkownik poda znak inny niż obsługiwane, program powinien wypisać „Błędny znak”.
// Jeśli wpisanego działania nie da się zrealizować (tj. jest niezgodne z zasadami matematyki), to program powinien wypisać napis „Błąd”.

public class zadanie8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj działanmie, któe chcesz obliczyć");

        float number1 = scanner.nextFloat();
        String znak = scanner.next();
        float number2 = scanner.nextFloat();

        scanner.close();

        if (znak.equals("/") || znak.equals("*") || znak.equals("-") || znak.equals("+")) {
            if (znak.equals("+")) {
                float result = number1 + number2;
                System.out.println(result);
            }
            if (znak.equals("-")) {
                float result = number1 - number2;
                System.out.println(result);
            }
            if (znak.equals("*")) {
                float result = number1 * number2;
                System.out.println(result);
            }
            if (znak.equals("/")) {
                if (number2 != 0){
                float result = number1 / number2;
                System.out.println(result);
                }
                else{
                    System.out.println("błąd");
                }

            }

        }
        else {
            System.out.println("błędny znak");
        }
    }
}
