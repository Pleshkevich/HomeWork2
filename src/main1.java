import java.util.Scanner;
public class main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int i = sc.nextInt();

        if (i == 12 || i == 1 || i == 2) {
            System.out.println("Winter");
        } else if (i == 3 || i == 4 || i == 5) {
            System.out.println("Spring");
        } else if (i == 6 || i == 7 || i == 8) {
            System.out.println("Summer");
        } else if (i == 9 || i == 10 || i == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Нет такого месяца");
        }
    }
}