import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String23. Given a string that represents an arithmetic expression of the form "<digit>±< digit>±…±<digit>"
 * with operators "+" and "−" only (for example, "4+7−2−8"), output the value of given expression as an integer.
 *
 * Дана строка, изображающая арифметическое выражение вида «<цифра>±<цифра>±…±<цифра>», где на месте знака операции «±» находится символ «+» или «−» (например, «4+7−2−8»).
 * Вывести значение данного выражения (целое число).
 *
 * Created by Qudrat Abdurahimov on 02.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int sum;
        char c;

        System.out.println("Enter a string like 4+7−2−8");
        s =  br.readLine();

        sum = Character.getNumericValue(s.charAt(0));

        for (int i = 2; i < s.length(); i+=2){
            c = s.charAt(i  - 1);

            switch (c) {
                case '-':
                    sum -= Character.getNumericValue(s.charAt(i));
                    break;
                case '+':
                    sum += Character.getNumericValue(s.charAt(i));
                    break;
            }

        }
        System.out.print("The value of given expression " + sum);
    }
}
