import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String21. Given a positive integer, output all digit characters in the decimal representation of the integer (from right to left).
 *
 * Дано целое положительное число. Вывести символы, изображающие цифры этого числа (в порядке справа налево).
 *
 * Created by Qudrat Abdurahimov on 02.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        System.out.println("Enter the input string");
        s =  br.readLine();

        for (int i = s.length() - 1; i >= 0; i--)
            System.out.print(s.charAt(i));
    }
}
