import java.util.*;
public class Search {

    TreeMap<Integer,String> person = new TreeMap();



    String str;


    public void treem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите id или имя:");

        boolean intg = sc.hasNextInt();

        person.put(1946, "Mark");
        person.put(1, "Jack");
        person.put(13, "Sofy");
        person.put(3, "Josh");
        person.put(4, "Zen");
        person.put(5, "Pablo");
        person.put(6, "Dan");
        person.put(7, "Mary");
        person.put(8, "Carla");
        person.put(9, "Stas");
        person.put(10, "Mattew");

        if(intg == false){
            str = sc.nextLine();
            for (Map.Entry<Integer, String> entry : person.entrySet()) {
                if (entry.getValue().equals(str)) {
                    System.out.println(entry.getKey());
                }
            }}

        else if(intg == true) {
            int i = sc.nextInt();
            Object key;
            key = person.keySet().toArray()[i];
            System.out.println(person.get(key));
        }
}
}

