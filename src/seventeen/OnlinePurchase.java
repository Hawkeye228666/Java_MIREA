package seventeen;

import java.util.Scanner;

public class OnlinePurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите номер ИНН: ");
        String inn = scanner.nextLine();

        try {
            validateInn(inn);
            System.out.println("Заказ успешно оформлен для пользователя: " + fullName);
        } catch (InvalidInnException e) {
            System.out.println("Ошибка при оформлении заказа: " + e.getMessage());
        }
    }

    private static void validateInn(String inn) throws InvalidInnException {
        // Проверка на валидность ИНН (простой пример)
        if (inn.length() != 10) {
            throw new InvalidInnException("Недействительный ИНН. Длина должна быть 10 символов.");
        }

        try {
            Long.parseLong(inn); // Попытка преобразовать в число
        } catch (NumberFormatException e) {
            throw new InvalidInnException("Недействительный ИНН. ИНН должен содержать только цифры.");
        }

        // Дополнительные проверки могут быть добавлены в зависимости от правил валидации ИНН
    }
}
