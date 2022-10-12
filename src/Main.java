public class Main {
// Задание 1
    public static void checkLeapYear(int year){
    if (year % 4 == 0){
        System.out.println(year + "  - високосный год");
    } else {
        System.out.println(year + "  - не високосный год");
    }
    }

    // Задание 2
    public  static void printSetSystem(int clientDeviceYear, int clientDevice){
        if (clientDeviceYear < 2015 && clientDevice == 0){
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }  else if (clientDeviceYear < 2015 && clientDevice == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if(clientDeviceYear < 0){
            System.out.println("Несуществующий год");
        } else if (clientDevice != 0 && clientDevice != 1){
            System.out.println("Несуществующее приложение");
        } else {
            System.out.println("У вас все отлично");
        }
    }

    // Задание 3
public static void printDeliveryTime(int deliveryDistance){
    if (deliveryDistance < 20){
        System.out.println("Потребуется дней: 1");
    } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
        System.out.println("Потребуется дней: 2");
    } else if (deliveryDistance >=60 && deliveryDistance < 100) {
        System.out.println("Потребуется дней: 3");
    } else {
        System.out.println("потребуется больше дней");
    }
}
    public static void main(String[] args) {

    int year = 2021;
    checkLeapYear(year);

    int clientDeviceYear = 2015;
    int clientDevice = 1;
    printSetSystem(clientDeviceYear, clientDevice);

    int day = 95;
    printDeliveryTime(day);
    }


}