import java.util.Scanner;

public class PhysicalPerson implements Client{

    private int schet;


    public void inputMoney(){
        int amount = 0;
        if(amount>0){
            schet= schet + amount;
            System.out.println(schet);}
        else{
            System.out.println("Ошибка, вы ввели отрицательное значение");
        }
    }

    public void outputMoney(){
        int amount = 0;
        if( schet>amount){
            schet = schet - amount;
            System.out.println(schet);}
        else{
            System.out.println("На счете недостаточно средств");
        }
    }


}
