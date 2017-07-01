import java.util.Scanner;

/**
 * String5. Given an integer N (1 ≤ N ≤ 26), output N last small (that is, lowercase) letters of the English alphabet
 * in inverse order ("z", "y", "x", and so on).
 *
 * Дано целое число N (1 ≤ N ≤ 26).
 * Вывести N последних строчных (т. е. маленьких) букв латинского алфавита в обратном порядке (начиная с буквы «z»).
 *
 * Created by Qudrat Abdurahimov on 01.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Enter number");
        n = in.nextInt();

        // Letter z -> 122, y -> 121, ...

        for (int i = 1; i <= n; i++)
            System.out.print((char) (123 - i) + " ");

    }
}
