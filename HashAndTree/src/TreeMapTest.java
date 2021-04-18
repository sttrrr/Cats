import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapTest {
    public void catNames() {
        long start = System.currentTimeMillis();


        TreeMap catName = new TreeMap();
        catName.put(1, "Tom");
        catName.put(2, "Jack");
        catName.put(3, "Raf");
        System.out.println(catName);
        catName.size();
        long timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Время выполнения программы:" + timeWorkCode);
    }
}