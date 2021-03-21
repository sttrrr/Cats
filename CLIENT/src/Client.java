 abstract public  interface Client{
    public int schet = 300;



    public static void inputMoney(){

    }

    public static void outputMoney(){

    }

    public default void showMoney(){
        System.out.println("На вашем счете:"  + schet);
    }


}
