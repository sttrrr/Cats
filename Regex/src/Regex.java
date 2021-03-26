import java.nio.charset.StandardCharsets;
import java.util.regex.*;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex{
    public String getS() {
        return s;
    }

    String s;


        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("dh4[dfd4]]");
        boolean matches = matcher.matches();





    public void regex1(){
        if(matcher.find() == true){
            while(matcher.find()){
                System.out.println(matcher.group());
                char[] chArray = matcher.CharAt();
            }
            String repeat = (matcher).repeat(3);

        }
        else{
            System.out.println("Ошибка, введена неверная строка");
        }

    }


}