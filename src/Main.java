import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int i = sc.nextInt();

        switch (i) {
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("Нет такого месяца");
        }
    }
}