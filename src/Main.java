public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        System.out.println("Задача-1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
        System.out.println("Задача-2");
        int Year = 2015;
        int clientOS2 = 1;
        int clientDeviceYear = 2024;
        if (clientOS2 == 0 && clientDeviceYear < Year) { // делал как на разборе
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");//Исправил
        } else if (clientOS2 == 0 && clientDeviceYear >= Year) {
            System.out.println("Установите  версию приложения для IOS по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear < Year) {
            System.out.println("Установите  версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для Android  по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear >= Year) {
            System.out.println("Установите  версию приложения для Android по ссылке");
        }
        System.out.println();
        System.out.println("Задача-3");
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
        System.out.println();
        System.out.println("Задача-4");
        int distanceDelivery = 150;//все интервалы проверил все работает
        int deliveryDay = 1;
        if (distanceDelivery <= 20) {
            System.out.println("Потребуется дня " + deliveryDay);
        } else if (distanceDelivery >= 20 && distanceDelivery < 60) {
            System.out.println("Потребуется дней " + (deliveryDay + 1));
        } else if (distanceDelivery >= 60 && distanceDelivery <= 100) {
            System.out.println("Потребуется дня " + (deliveryDay + 2));
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println();
        System.out.println("Задача-5");
        int monthNumber = 13;// кажись сделал))
        switch (monthNumber) {
            case 1:
                System.out.println("  Пришла зима ");
                break;
            case 2:
                System.out.println(" Пришла зима ");
                break;
            case 3:
                System.out.println("Пришла Весна  ");
                break;
            case 4:
                System.out.println("Пришла Весна ");
                break;
            case 5:
                System.out.println(" Пришла Весна ");
                break;
            case 6:
                System.out.println("  Пришло лето  ");
                break;
            case 7:
                System.out.println(" Пришло лето  ");
                break;
            case 8:
                System.out.println(" Пришло лето  ");
                break;
            case 9:
                System.out.println(" Пришла осень ");
                break;
            case 10:
                System.out.println("  Пришла осень ");
                break;
            case 11:
                System.out.println(" Пришла осень ");
                break;
            case 12:
                System.out.println(" Пришла зима ");
                break;
            default:
                System.out.println(" Такого месяца не существует ");
                break;
        }

    }
}