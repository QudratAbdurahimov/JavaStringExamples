import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String3
 * Given a character C, output two characters:
 * the first character precedes C in the character set,
 * the second one follows C in the character set.
 *
 * Дан символ C. Вывести два символа, первый из которых предшествует символу C в кодовой таблице,
 * а второй следует за символом C.
 *
 * Created by Qudrat Abdurahimov on 01.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char c, before, after;

        System.out.println("Input character");
        c = (char) br.read();

        before = (char) (c - 1);
        after  = (char) (c + 1);

        System.out.println(before + " " + c + " " + after);

    }
}
