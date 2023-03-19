import java.util.Scanner;

public class main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i = sc.nextInt();
        if (i % 2 == 1) {
            System.out.println("Не четное число");
        }
        else {
            System.out.println("Четное число");
        }
    }
}
