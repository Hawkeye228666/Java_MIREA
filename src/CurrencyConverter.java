import java.util.Scanner;
public class CurrencyConverter {
    public static double func(String c) {
        double ans = switch (c) {
            case "RUB" -> 100;
            case "USD" -> 1.00;
            case "EUR" -> 0.85;
            case "GBP" -> 0.76;
            case "JPY" -> 109.20;
            case "AUD" -> 1.36;
            case "CAD" -> 1.31;
            case "CHF" -> 0.91;
            case "CNY" -> 6.46;
            default -> {
                System.out.println("Такой валюты нет.");
                yield 0;
            }
        };
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите сумму(натуральное число): ");
        double amount = in.nextDouble();
        System.out.print("Введите изначальную валюту (RUB, USD, EUR, GBP, JPY, AUD, CAD, CHF, CNY): ");
        String currencyCode1 = in.next().toUpperCase();
        System.out.print("Введите валюту, в которую хотите перевести (RUB, USD, EUR, GBP, JPY, AUD, CAD, CHF, CNY): ");
        String currencyCode2 = in.next().toUpperCase();

        double rate = func(currencyCode1);

        double convertedAmount = amount / rate;

        rate = func(currencyCode2);
        convertedAmount = convertedAmount * rate;

        System.out.printf("%.2f %s = %.2f %s.", amount, currencyCode1, convertedAmount, currencyCode2);
    }
}
