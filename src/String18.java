import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String18. Given a string, convert all Latin capital letters of the string to lowercase and
 * all Latin small letters of the string to uppercase.
 *
 * Дана строка. Преобразовать в ней все строчные буквы в прописные, а прописные — в строчные.
 *
 * Created by Qudrat Abdurahimov on 02.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s, c = "";

        System.out.println("Enter the input string");
        s =  br.readLine();

        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isLowerCase(s.charAt(i)))
                c += Character.toUpperCase(s.charAt(i));
            else
                if (Character.isUpperCase(s.charAt(i)))
                    c += Character.toLowerCase(s.charAt(i));
        }

        s = c;
        System.out.println(s);
    }
}
