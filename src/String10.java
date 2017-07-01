import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String10. Given a string, output a new string that contains the given string characters in inverse order.
 *
 * Дана строка. Вывести строку, содержащую те же символы, но расположенные в обратном порядке.
 *
 * Created by Qudrat Abdurahimov on 02.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s, c = "";

        System.out.println("Enter the input string");

        s =  br.readLine();

        // first method
        for (int i = 0; i < s.length(); i++)
        c = s.charAt(i) + c;

        System.out.println(c);

        // second method
        String reverse = new StringBuffer(s).reverse().toString();
        System.out.println(reverse);
    }
}
