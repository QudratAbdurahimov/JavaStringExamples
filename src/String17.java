import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String17. Given a string, convert all Latin small letters of the string to uppercase.
 *
 * Дана строка. Преобразовать в ней все строчные буквы  в прописные.
 *
 * Created by Qudrat Abdurahimov on 02.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        System.out.println("Enter the input string");
        s =  br.readLine();

        s = s.toUpperCase();

        System.out.println(s);
    }
}
