import java.util.Arrays;
import java.util.Random;

public class Generator {


    void getValues() {
        
        final int cifrramin = 1 ;
        final int ciframax = 9;
        final int regionmax = 100;
        Object[] result = new Object[7];
        String array[] = {"й", "ц", "у", "к", "е", "н", "г", "ш", "щ", "з", "х", "ф", "ы", "в", "а", "п", "р", "о", "л", "д", "ж", "э", "я", "ч", "с", "м", "и", "т", "ь", "б", "ю", "ъ", "ё"};
        Random random = new Random();
        int index = random.nextInt(array.length);
        result[0] = array[index];
        int chislo = (int) ((Math.random()*((ciframax-cifrramin)+1))+cifrramin);
        result[1] = chislo;
        result[2] = chislo;
        result[3] = chislo;
        index = random.nextInt(array.length);
        result[4] = array[index];
        index = random.nextInt(array.length);
        result[5] = array[index];
        int region = (int) ((Math.random()*((regionmax-cifrramin)+1))+cifrramin);
        result[6] = region;
        StringBuilder builder = new StringBuilder();
        for(Object s : result) {
            builder.append(s);//обновление значения
        }
        String str = builder.toString();//привод массива к строке
        System.out.println(str);
    }}