import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String13. Given a string, find the amount of digits in the string.
 *
 * Дана строка. Подсчитать количество содержащихся в ней цифр.
 *
 * Created by Qudrat Abdurahimov on 02.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int n = 0;

        System.out.println("Enter the input string");
        s =  br.readLine();

        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)))
                n++;

        System.out.println("The amount of digits in the string is " + n);
    }
}
