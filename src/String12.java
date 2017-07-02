import java.io.IOException;
import java.util.Scanner;

/**
 * String12. Given a nonempty string and an integer N (> 0),
 * output a new string that contains the given string characters separated by N characters "*".
 *
 *  Дана непустая строка S и целое число N (> 0). Вывести строку, содержащую символы строки S,
 *  между которыми вставлено по N символов «*» (звездочка).
 *
 * Created by Qudrat Abdurahimov on 02.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String12 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int n;
        String s, c = "", newString = "";

        System.out.println("Enter the input string ");
        s = in.nextLine();

        System.out.println("Enter the input number");
        n = in.nextInt();


        for (int i = 1; i <= n; i++) {
            c += "*";
        }

        n = s.length();

        for (int i = 0; i < n - 1; i++) {
            newString += s.charAt(i) + c;
        }

        // add last character
        newString += s.charAt(s.length() - 1);

        System.out.println(newString);

    }
}
