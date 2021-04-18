import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetTest {
    public void catNames(){
        long start = System.currentTimeMillis();

        TreeSet catName = new TreeSet();
        catName.add("Tom");
        catName.add("Jack");
        catName.add("Raf");
        System.out.println(catName);
        catName.size();
        long timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Время выполнения программы:" + timeWorkCode);
    }
}
