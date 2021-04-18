import java.util.Scanner;

public class HashMap {
    public static void catNames(){
        long start = System.currentTimeMillis();
        java.util.HashMap<Integer, String> catName = new java.util.HashMap<>();
        catName.put(1, "Tom");
        catName.put(2, "Jack");
        catName.put(3, "Raf");

        System.out.println(catName);
        catName.size();
        long timeWorkCode = System.currentTimeMillis() - start;
        System.out.println("Время выполнения программы:" + timeWorkCode);


    }}
