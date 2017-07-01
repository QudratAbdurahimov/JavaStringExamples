import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Given a character C, output its numeric value in the character set.
 *
 * Äàí ñèìâîë C. Âûâåñòè åãî êîä (ò. å. íîìåğ â êîäîâîé òàáëèöå)
 * ğóñ÷à õàğôëàğíè êóğìàÿïòè
 *
 * Created by Qudrat Abdurahimov on 01.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String1 {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input character");

        c = (char) br.read();
        System.out.println(c + "->" + (int) c);

    }
}
