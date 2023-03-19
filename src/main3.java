import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i = sc.nextInt();
        if (i > -5) {
            System.out.println("Тепло");
        } else if ( -5 <= i | i > -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }
}
