import java.util.Scanner;

public class individualBusinessman extends Client {
    private int schet = 300;
    private int dif;

    public void inputMoney() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму, которую хотите внести: ");
        int dif = in.nextInt();
        if (dif > 0) {
            if(dif<1000){
                schet = (int)(schet + (dif - (dif * 0.01)));
                System.out.println(schet);
            }
            else if(dif>=1000){
                schet = (int)(schet + (dif - (dif * 0.005)));
                System.out.println(schet);
            }

        } else {
            System.out.println("Ошибка, вы ввели отрицательное значение");
        }
    }

    public void outputMoney() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму, которую хотите снять: ");
        int dif = in.nextInt();
        if (schet > dif) {

            schet = schet - dif;
            System.out.println(schet);
        } else {
            System.out.println("На счете недостаточно средств");
        }
    }
    public void showMoney(){
        System.out.println("Ваш остаток по счету: " + schet);
    }
}
