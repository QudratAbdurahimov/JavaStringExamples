import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String6. A character C representing a digit or a letter of the Latin alphabet is given.
 * If C is a digit then output the string "digit",
 * if C is a capital letter then output the string "capital", otherwise output the string "small".
 *
 * Дан символ C, изображающий цифру или букву (латинскую). Если C изображает цифру, то вывести строку «digit»,
 * если C заглавная буква, тогда выведите строку «capital», иначе выведите строку «small»
 *
 * Created by Qudrat Abdurahimov on 01.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String6 {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter character");

        c = (char) br.read();

        if (Character.isDigit(c))
            System.out.println("digit");

        if (Character.isUpperCase(c))
            System.out.println("capital");

        if (Character.isLowerCase(c))
            System.out.println("small");
    }
}
