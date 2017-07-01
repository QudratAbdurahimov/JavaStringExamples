import java.util.Scanner;
/**
 * String2.
 * Given an integer N (32 ≤ N ≤ 126), output a character with the numeric value N in the character set.
 *
 * Дано целое число N (32 ≤ N ≤ 126). Вывести символ с кодом, равным N.
 *
 * Created by Qudrat Abdurahimov on 01.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Enter number");
        n = in.nextInt();

        System.out.println(n + "->" + (char) n);

    }
}
