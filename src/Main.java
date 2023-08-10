// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        zd1();
        zd2();
        zd3();
        zd4();
        zd5();

    }
    public static void zd1(){
        char clientOS = 1;
        switch (clientOS){
            case 0: {
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            }
            case 1 : {
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            }
        }
    }
    public static void zd2(){
        char clientOS = 0;
        int clientDeviceYear = 3000;
        var zagotovka = "";
        System.out.println();
        if (clientDeviceYear < 2015){
            zagotovka = "Установите облегченную версию приложения";
        }
        else {
            zagotovka = "Установите версию приложения";
        }
        switch (clientOS){
            case 0:
                System.out.println(zagotovka + " для iOS по ссылке");
                break;
            case 1:
                System.out.println(zagotovka + " для Android по ссылке");
                break;
        }
    }
    public static void zd3(){
        int year = 2000;
        System.out.println();
        if (year%4 == 0 && year % 100 != 0 ){
            System.out.println("Високосный год");

        } else if (year% 100 ==0 && year % 400 == 0) {
            System.out.println("Високосный год");

        }
        else {
            System.out.println("Год обычный");
        }
    }
    public static void zd4(){
        int deliveryDistance = 100;
        System.out.println();
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance < 101) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void zd5(){
        int monthNumber = 9;
        System.out.println();
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }

    }



}
