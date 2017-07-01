import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * String8. Given an integer N (> 0) and a character C, output a string that is of length N and contains characters C.
 * Created by Qudrat Abdurahimov on 02.07.2017.
 *
 * Дано целое число N (> 0) и символ C. Вывести строку длины N, которая состоит из символов C.
 *
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String8 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int n;
        char c;

        System.out.println("Enter number");
        n = in.nextInt();

        System.out.println("Enter character");
        c = in.next().charAt(0);

        String s = "";

        for (int i = 1; i <= n; i++) {
            s += c;
        }


        System.out.println(s);

    }
}
