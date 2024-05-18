public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        System.out.println("Задача-1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
        System.out.println("Задача-2");
        int clientDeviceYear = 2024;
        if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите  версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        System.out.println();
        System.out.println("Задача-3");
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " высокосный");
        } else {
            System.out.println("Год " + year + " не является высокосным");
        }
        System.out.println();
        System.out.println("Задача-4");
        int distanceDelivery = 95;
        int day = 1;
        if (distanceDelivery < 20) {
            System.out.println("Потребуется дня " + day);
        } else if (distanceDelivery >= 20 && distanceDelivery < 60) {
            System.out.println("Потребуется дней " + (day + 1));
        } else if (distanceDelivery >= 60 && distanceDelivery <= 100) {
            System.out.println("Потребуется дня " + (day + 2));
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println();
        System.out.println("Задача-5");
        int monthNumber = 1;
        switch (monthNumber) {
            case 1:
                System.out.println(" Зима ");
                break;
            case 2:
                System.out.println(" Зима ");
                break;
            case 3:
                System.out.println(" Весна ");
                break;
            case 4:
                System.out.println(" Весна ");
                break;
            case 5:
                System.out.println(" Весна ");
                break;
            case 6:
                System.out.println(" Лето пришло ");
                break;
            case 7:
                System.out.println(" Лето ");
                break;
            case 8:
                System.out.println(" Лето ");
                break;
            case 9:
                System.out.println(" Золотая осень ");
                break;
            case 10:
                System.out.println(" Осень ");
                break;
            case 11:
                System.out.println(" Зима пришла ");
                break;
            case 12:
                System.out.println(" Зима ");
                break;
            default:
                System.out.println(" Такого месяца не существует ");
                break;// надеюсь ошибок будет мало)))!!!
        }

    }
}