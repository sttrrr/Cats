import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Persons {





    public void emp() {
        List<Employe> list = List.of(
        new Employe(16000, "Смирнов"),
        new Employe(23000, "Соколов"),
        new Employe(48500, "Иванов"),
        new Employe(140000, "Медведев"),
        new Employe(16000, "Попов"),
        new Employe(84000, "Кузнецов"));

        //public void pers(){

        List<Integer> list1;
        List<String> list2 = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        List<String> result1 = new ArrayList<>();

        for(Employe employe: list){
            Integer salary = employe.getSalary();



            result.add(salary);
        }

        for(Employe employe: list){
            String name = employe.getName();

            result1.add(name);
        }

        list1 = result;
        list2 = result1;
        List<Employe> str =
                (List<Employe>) list.stream().filter(i->i.getSalary() == i.getSalary()).sorted().collect(Collectors.toList());;
        System.out.println( list1);
        System.out.println(list2);
        System.out.println(str);


    }
    }











        /*ArrayList<String> sortPerson = person.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));

         */







