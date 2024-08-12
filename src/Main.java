import java.time.LocalDate;

public class Main {
    public static void defineOS (int clientOS, int phoneYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && phoneYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && phoneYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && phoneYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void main(String[] args) {
        int clientOS = 0;
        int phoneYear = 2023;
        defineHighGradeYear(year);
    }
}