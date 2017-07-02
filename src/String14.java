import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String14. Given a string, find the amount of Latin capital letters in the string.
 *
 * Дана строка. Подсчитать количество содержащихся в ней прописных латинских букв.
 *
 * Created by Qudrat Abdurahimov on 02.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int n = 0;

        System.out.println("Enter the input string");
        s =  br.readLine();

        for (int i = 0; i < s.length(); i++)
            if (Character.isUpperCase(s.charAt(i)))
                n++;

        System.out.println("The amount of Latin capital letters in the string is " + n);

    }
}
