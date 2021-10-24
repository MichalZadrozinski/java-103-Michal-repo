import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zadanie18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();
        boolean userSneeze = doesUserSneeze(userInput);

        if (userSneeze) {
            System.out.println("Użytkownik kichnął.");
        } else {
            System.out.println("Użytkownik Nie kichnął.");
        }

        scan.close();

}

    private static boolean doesUserSneeze (String userInput){
        Pattern sneezePattern = Pattern.compile("a+ psik");
        Matcher matcher = sneezePattern.matcher(userInput);
        return matcher.find();

    }

}
