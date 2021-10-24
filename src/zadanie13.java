import java.util.Scanner;

public class zadanie13 {
    //Napisz program, który „się jąka”, to znaczy pobiera użytkownika tekst (zmienną typu String),
    // a następnie wypisuje podany tekst, w którym każde słowo wypisane jest po dwa razy.
    // Przykładowo, dla wejścia: „To jest mój test” program powinien wypisać „To To jest jest mój mój test test”.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz dowolne zdanie");
        String text = scanner.nextLine();

        String[] array = text.split(" ");

        for (int i = 0; i < array.length; i++) {
            array[i] += " " + array[i] + " ";
            System.out.print(array[i]);

        }

    }

}
