import java.util.Scanner;
public class Main implements Client{
    public static void main(String[] args) {
        individualBusinessman Tom = new individualBusinessman();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        int amount= in.nextInt();
        System.out.println("ИП");
        Tom.showMoney();
        Tom.inputMoney();


    }
}
