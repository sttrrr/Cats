import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        IndividualBusinessman Tom = new IndividualBusinessman();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        int amount = in.nextInt();
        System.out.println("ИП");
        Tom.showMoney();
        Tom.inputMoney(amount);


    }
}
