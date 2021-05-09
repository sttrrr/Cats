import java.util.*;
public class Search {

    TreeMap<Integer,String> person = new TreeMap();



    String str;


    public void treem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите id или имя:");

        boolean intg = sc.hasNextInt();

        person.put(1559, "Mark");
        person.put(7756, "Jack");
        person.put(2, "Sofy");
        person.put(3, "Josh");
        person.put(8954, "Zen");
        person.put(5, "Pablo");
        person.put(345, "Dan");
        person.put(7, "Mary");
        person.put(90000, "Carla");
        person.put(9, "Stas");
        person.put(10, "Mattew");

        if(intg == false){
            str = sc.nextLine();
            if (person.containsValue(str)){

            for (Map.Entry<Integer, String> entry : person.entrySet()) {
                if (entry.getValue().equals(str)) {
                    System.out.println(entry.getKey());
                }}
            }
            else {
                System.out.println("Такого значения не существует");
            }
        }

        else if(intg == true) {
            int i = sc.nextInt();
            if(person.containsKey(i)){

            String element1 =(String) person.get(i);
            System.out.println(element1);
        }
        else{
        System.out.println("Такого id не существует");}
        }
}
}

