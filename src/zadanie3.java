import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {

        double x1;
        double x2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dodatnie liczby całkowite w następującej kolejności: a, b, c");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        double delta = (Math.pow(a,2))-4*a*c;

        if (delta>=0){
            x1 = (-b - Math.sqrt(delta))/(2*a);
            x2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("x1= "+ x1);
            System.out.println("x2= " +x2);

        } else{
            System.out.println("Delta ujemna");
        }
    }
}
