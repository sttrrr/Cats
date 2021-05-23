import java.util.Comparator;

public class Employe {


    private int salary;



    private String name;

    public Employe(int salary, String name){
        this.name = name;
        this.salary = salary;
    }
     public int getSalary(){return salary;}

    public String getName(){return name;}
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setName(String name) {
        this.name = name;
    }
}
