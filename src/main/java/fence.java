import java.util.Scanner;

public class fence {
    public static void main(String[] args) {
        //Кол-во букв
        int a = 15;
        // Кол-во пробелов
        int b = 3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину забора в сантиметрах: ");
        int fen = sc.nextInt();

        if (a / 3 * 62 + b * 12 <= Math.abs(fen)) {
            System.out.println("Надпись на заборе поместится");
        } else {
            System.out.println("Надпись на заборе не поместится");
        }

    }
}