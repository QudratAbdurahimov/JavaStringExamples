import java.io.IOException;
import java.util.Scanner;

/**
 * String9. Given an even integer N (> 0) and two characters C1, C2, output a string that is of length N,
 * begins with C1, and contains alternating characters C1 and C2.
 *
 * Дано четное число N (> 0) и символы C1 и C2. Вывести строку длины N,
 * которая состоит из чередующихся символов C1 и C2, начиная с C1.
 *
 * Created by Qudrat Abdurahimov on 02.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String9 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int n;
        char c1, c2;

        System.out.println("Enter the input number");
        n = in.nextInt();

        System.out.println("Enter first character");
        c1 = in.next().charAt(0);
        System.out.println("Enter second character");
        c2 = in.next().charAt(0);

        String s1 = "", s2 = "";

        // first method
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1)
                s1 += c1;
            else
                s1 += c2;
        }

        // second method
        for (int i = 1; i <= n / 2; i++)
            s2 += c1 + "" + c2;

        System.out.println(s1);
        System.out.println(s2);

    }
}
