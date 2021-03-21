import java.util.Scanner;

public class IndividualBusinessman implements Client  {
    private int schet = 300;


    public void inputMoney(int amount) {
        if ( amount > 0) {
            if(amount<1000){
                schet = (int)(schet + (amount - (amount * 0.01)));
                System.out.println(schet);
            }
            else if(amount>=1000){
                schet = (int)(schet + (amount - (amount * 0.005)));
                System.out.println(schet);
            }

        } else {
            System.out.println("Ошибка, вы ввели отрицательное значение");
        }
    }

    public void outputMoney(int amount) {

        if (schet > amount) {

            schet = schet - amount;
            System.out.println(schet);
        } else {
            System.out.println("На счете недостаточно средств");
        }
    }

}
