import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String24. Given a string with the binary representation of a positive integer,
 * output a new string with the decimal representation of this integer.
 *
 * Дана строка, изображающая двоичную запись целого положительного числа. Вывести строку,
 * изображающую десятичную запись этого же числа.
 *
 * Created by Qudrat Abdurahimov on 02.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String24 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int n = 0, k;
        char c;

        System.out.println("Enter a binary representation of a positive integer");
        s =  br.readLine();

        // simple method
        System.out.println(Integer.parseInt(s, 2));

        // another method
        k = s.length() - 1;
        for (int i = 0; i < s.length(); i++){
            n += Character.getNumericValue(s.charAt(i)) *  Math.pow(2, k);
            k--;
        }

        // convert to string
        s = Integer.toString(n);
        System.out.println(s);
    }
}
