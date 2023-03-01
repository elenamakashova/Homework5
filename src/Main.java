public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        byte clientOS = 1;
        int clientDeviceYear = 2013;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear<2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
        }

    public static void task3 () {
        System.out.println("Задача 3");
        int year = 1600;
        if (year%400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year%4 == 0 && year%100 != 0){
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не високосный");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        byte deliveryTime = 1;
        if (deliveryDistance > 20) {
            deliveryTime++;
        }
        if (deliveryDistance > 60) {
            deliveryTime++;
        }
        System.out.println("На доставку потребуется дней: " + deliveryTime);
        if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte monthNumber = 4;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Этот месяц зимний");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц весенний");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц летний");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц осенний");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}