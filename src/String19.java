import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String19. A string is given. If the string represents an integer then output 1,
 * if the string represents a real number (with nonzero fractional part) then output 2, otherwise output 0.
 * A fractional part of a real number is preceded by the decimal point ".".
 *
 * Дана строка. Если она представляет собой запись целого числа, то вывести 1, если вещественного (с дробной частью) — вывести 2;
 * если строку нельзя преобразовать в число, то вывести 0.
 * Считать, что дробная часть вещественного числа отделяется от его целой части десятичной точкой «.».
 *
 * Created by Qudrat Abdurahimov on 02.07.2017.
 * http://dastur.uz; dasturchi@mail.ru
 */
public class String19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int n = 0;
        double d = 0;

        System.out.println("Enter the input string");
        s =  br.readLine();

        try {
            // If the string represents an integer
            n = Integer.parseInt(s);
            System.out.println(1);
        } catch (NumberFormatException e1) {

            try {
                // if the string represents a real number
                d = Double.parseDouble(s);
                System.out.println(2);
            } catch (NumberFormatException e2) {
                System.out.println(0);
            }
        } // end of try catch

    }
}
