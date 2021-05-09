import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Persons {

    public Persons(int salary, String name) {
        salary = salary;
        name = name;
    }

    public static void pers(){
    List<Persons> person = new ArrayList<>();
    Persons Smirnov = new Persons(16000, "Смирнов");
    Persons Kovalev = new Persons(138000, "Ковалев");
    Persons Ivanov = new Persons(82000, "Иванов");
    Persons Sidorov = new Persons(43000, "Сидоров");
    Persons Firsov = new Persons(67000, "Фирсов");
       person.add(Smirnov);
        person.add(Kovalev);
        person.add(Ivanov);
        person.add(Sidorov);
        person.add(Firsov);

    //тут раньше была ошибка
       Collections.sort(person);
       System.out.println(person);
}}
