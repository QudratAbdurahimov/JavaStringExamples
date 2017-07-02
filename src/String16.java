import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String16.Given a string, convert all Latin capital letters of the string to lowercase.
 *
 * Дана строка. Преобразовать в ней все прописные латинские буквы в строчные.
 *
 * Created by Qudrat Abdurahimov on 02.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        System.out.println("Enter the input string");
        s =  br.readLine();

        s = s.toLowerCase();

        System.out.println(s);
    }
}
