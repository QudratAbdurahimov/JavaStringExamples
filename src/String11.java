import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String11.Given a nonempty string, output a new string that contains the given string characters
 * separated by a blank character.
 *
 * Дана непустая строка S. Вывести строку, содержащую символы строки S, между которыми вставлено по одному пробелу.
 *
 * Created by Qudrat Abdurahimov on 02.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s, c = "";

        System.out.println("Enter the input string");

        s =  br.readLine();

        for (int i = 0; i < s.length(); i++)
            c += s.charAt(i) + " ";

        System.out.println(c);

    }
}
