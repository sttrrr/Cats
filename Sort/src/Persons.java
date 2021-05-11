import java.util.*;
import java.util.stream.Stream;

public class Persons {
    public Persons(int salary, String name) {
        salary = salary;
        name = name;
    }

    public Persons() {

    }

    public void emp() {
        List<Persons> person = List.of(
                //public void pers(){
                new Persons(16000, "Смирнов"),
                new Persons(82000, "Ковалев"),
                new Persons(82000, "Иванов"),
                new Persons(43000, "Сидоров"),
                new Persons(67000, "Фирсов"));
        Stream<Persons> stream;
        person.stream()
                .filter(i -> Collections.frequency(person, i) >1)
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




}


