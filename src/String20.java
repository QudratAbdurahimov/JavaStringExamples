import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String20.[Pascal] Given a positive integer,
 * output all digit characters in the decimal representation of the integer (from left to right).
 *
 * Дано целое положительное число. Вывести символы, изображающие цифры этого числа (в порядке слева направо).
 *
 * Created by Qudrat Abdurahimov on 02.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        System.out.println("Enter the input string");
        s =  br.readLine();

        for (int i = 0; i < s.length(); i++)
            System.out.println(s.charAt(i));
    }
}
