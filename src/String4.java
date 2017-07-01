import java.util.Scanner;

/**
 * String4. Given an integer N (1 ≤ N ≤ 26), output N first capital (that is, uppercase)
 * letters of the English alphabet ("A", "B", "C", and so on).
 *
 * Дано целое число N (1 ≤ N ≤ 26). Вывести N первых прописных (т. е. заглавных) букв латинского алфавита.
 *
 * Created by Qudrat Abdurahimov on 01.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */

public class String4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Enter number");
        n = in.nextInt();

        // Letter A -> 65, B -> 66, ...

        for (int i = 1; i <= n; i++)
        System.out.print((char) (i + 64) + " ");

    }
}
