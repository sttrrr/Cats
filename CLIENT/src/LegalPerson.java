import java.util.Scanner;

public class LegalPerson implements Client{

    private int schet;


    public void inputMoney(int amount){

        if (amount>0){
            schet = schet + amount;
            System.out.println(schet);}
        else {
            System.out.println("Ошибка, вы ввели отрицательное значение");
        }
    }

    public void outputMoney(int amount){

        if(schet>amount){
            schet = (int) (schet - (amount+amount*0.01));
            System.out.println(schet);}
        else {
            System.out.println("На счете недостаточно средств");
        }
    }


}
