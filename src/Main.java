public class Main {
    public static void main(String[] args) {

        // task 1: iOS vs Android
        System.out.println("task 1");
        int clientOS = 0;
        int clientDeviceYear = 2010;

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Проверьте данные");
        }

        // task 2: app version
        System.out.println("task 2");
        switch (clientOS) {
            case 0:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
        }

        // task 3: leap year
        System.out.println("task 3");
        int year = 400;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }
        else System.out.println(year + " год не является високосным");

        // task 4: bank cards delivery
        System.out.println("task 4");
        int deliveryDistance = 222;
        int days = 2 + (deliveryDistance - 20) / 40;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        }
        else {
            System.out.println("Потребуется дней: " + days);
        }
        // task 5: season
        System.out.println("task 5");
        int monthNumber = 23;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Зимушка");
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
                System.out.println("Осенняя осень");
                break;
            case 12:
                System.out.println("Зимушка");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}