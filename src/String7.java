import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String7. Given a nonempty string, output numeric values of its first and last character in the character set.
 *
 * Дана непустая строка. Вывести коды ее первого и последнего символа.
 *
 * Created by Qudrat Abdurahimov on 02.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int first, last;

        System.out.println("Enter string");

        s =  br.readLine();

        first = s.charAt(0);
        last  = s.charAt(s.length() - 1);

        System.out.println("Numeric value of first character is : " + first);
        System.out.println("Numeric value of last character  is : " + last);
    }
}
