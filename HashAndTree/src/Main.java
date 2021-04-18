import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("TreeSet");
        TreeSetTest cats = new TreeSetTest();
        cats.catNames();
        System.out.println("TreeMap");
        TreeMapTest cats1 = new TreeMapTest();
        cats1.catNames();
        System.out.println("HashSetTest");
        HashSetTest cats2 = new HashSetTest();
        cats2.catNames();
        System.out.println("TreeSet");
        HashMap cats3 = new HashMap();
        cats3.catNames();
    }

}
