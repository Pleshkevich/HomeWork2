import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i = sc.nextInt();

        switch (i) {
            case 1 -> System.out.println("Красный");
            case 2 -> System.out.println("Оранжевый");
            case 3 -> System.out.println("Желтый");
            case 4 -> System.out.println("Зеленый");
            case 5 -> System.out.println("Голубой");
            case 6 -> System.out.println("Синий");
            case 7 -> System.out.println("Фиолетовый");
            default -> System.out.println("В радуге 7 цветов");
        }
    }
}
