public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {

        System.out.println("\nЗадача_1");
        int clientOS =0;

        if (clientOS == 0) {
            System.out.println("Скачайте прилжение для IOS по ссылке:");
        } else if (clientOS == 1) {
            System.out.println("Скачайте приложение для Андройд по ссылке:");
        } else
            System.out.println("Продай свой тапок и купи нормальный телефон");
    }

    public static void task2() {

        System.out.println("\nЗадача_2");
        int clientOS = 0;
        int clientsDevisesYear = 2015;

        if (clientOS == 0 && clientsDevisesYear >= 2015) {
            System.out.println("Скачайте прилжение для IOS по ссылке:");
        } else if (clientOS == 0 && clientsDevisesYear < 2015) {
            System.out.println("Скачайте облегчённую версию приложения для IOS по ссылке:");
        } else if (clientOS == 1 && clientsDevisesYear >= 2015 ) {
            System.out.println("Скачайте приложение для Андройд по ссылке:");
        } else if ( clientOS == 1 && clientsDevisesYear < 2015) {
            System.out.println("Скачайте олегчённую версию приложение для Андройд по ссылке:");
        } else
            System.out.println("Продай свой тапок и купи нормальный телефон");
    }


    public static void task3() {

        System.out.println("\nЗадача_3");
        int year = 100;
        boolean target = ((year % 4) == 0 && (year % 100 != 0)) || ((year % 100) == 0 && (year % 400) == 0);

        if (target) {
            System.out.println("Год весокостный");
        } else System.out.println("Год не весокостный");



    }

    public static void task4() {

        System.out.println("\nЗадача_4");

        // Правила доставки такие:
        //
        //Доставка в пределах 20 км занимает сутки.
        //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        //Свыше 100 км доставки нет.

        int deliveryDistance = 95;
        int deliveryTime =1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + deliveryTime);
        } else if (20 < deliveryDistance && deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней " + deliveryTime);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Потребуется дней " + deliveryTime);
        } else System.out.println("Доставки нет");

    }



    public static void task5() {

        System.out.println("\nЗадача_5");

        int month = 1;

        switch (month) {

            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
        }


    }


}