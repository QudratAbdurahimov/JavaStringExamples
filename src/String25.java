import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String25. Given a string with the decimal representation of a positive integer,
 * output a new string with the binary representation of this integer.
 *
 * Дана строка, изображающая десятичную запись целого положительного числа.
 * Вывести строку, изображающую двоичную запись этого же числа.
 *
 * Created by Qudrat Abdurahimov on 02.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String25 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int n;

        System.out.println("Enter a positive integer");
        s =  br.readLine();

        // convert to integer
        n = Integer.parseInt(s);
        // clear string
        s = "";

        while (n > 0) {
            if (n % 2 == 0)
                s = '0' + s;
            else
                s = '1' + s;
            n /= 2;
        }

        System.out.println(s);
    }
}
