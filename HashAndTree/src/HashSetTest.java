import java.util.HashSet;
import java.util.Scanner;

class HashSetTest {

    public static void catNames(){
        long start = System.currentTimeMillis();
        HashSet catName = new HashSet();
        catName.add("Tom");
        catName.add("Jack");
        catName.add("Raf");

        System.out.println(catName);
        catName.size();
        long timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Время выполнения программы:" + timeWorkCode);



    }}
