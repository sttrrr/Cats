import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {

        String s = "gf7[ff]";

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) > 47 && s.charAt(i) <= 58) {
                System.out.println(s.charAt(i));
                int y = Character.getNumericValue(s.charAt(i));
                Pattern p = Pattern.compile("\\[\\D+");
                Matcher m = p.matcher(s);
                Pattern z = Pattern.compile("^\\D+");
                Matcher words = z.matcher(s);
                if (m.find()) {
                    if (words.find()) {
                        // ...then you can use group() methods.
                        System.out.println(words.group(0) + m.group(0).repeat(y)); // whole matched expression
                    }

                }

            }

    }
}
