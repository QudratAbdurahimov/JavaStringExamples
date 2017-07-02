import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String22. Given a string that represents a positive integer, output the sum of digits of this integer.
 *
 * Дана строка, изображающая целое положительное число. Вывести сумму цифр этого числа.
 *
 * Created by Qudrat Abdurahimov on 02.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int sum = 0;

        System.out.println("Enter a positive integer");
        s =  br.readLine();

        for (int i = 0; i < s.length(); i++){
            sum += Character.getNumericValue(s.charAt(i));
        }
            System.out.print("sum of digits " + sum);
    }
}
