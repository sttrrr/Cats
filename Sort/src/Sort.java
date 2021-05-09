import java.util.*;
import java.util.stream.Collectors;

public class Sort {
    Map<Integer, String> employee = new HashMap<Integer, String>();

    public void emp() {
    employee.put(17000, "Иванов");
    employee.put(51000, "Смирнов");
    employee.put(26000, "Сидоров");
    employee.put(26000, "Артемьев");
    employee.put(43000, "Круглов");
    employee.put(82000, "Колесников");
    employee.put(37000, "Перов");
    employee.put(37000, "Белый");
    employee.put(45000, "Фирсов");

       // employee.entrySet().stream();
                //.sorted(Map.Entry.<Integer, String>comparingByValue());
        List<String> result = employee.entrySet().stream().sorted(
                Comparator.comparing(n->n.toString())).collect(Collectors.toList());
    System.out.println(employee);

}
}
