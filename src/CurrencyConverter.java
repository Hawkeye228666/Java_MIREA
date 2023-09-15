import java.util.Scanner;
public class CurrencyConverter {
    public static double func(String c) {
        double ans = 0;
        switch (c) {
            case "USD":
                ans = 1.00;
                break;
            case "EUR":
                ans = 0.85;
                break;
            case "GBP":
                ans = 0.76;
                break;
            case "JPY":
                ans = 109.20;
                break;
            case "AUD":
                ans = 1.36;
                break;
            case "CAD":
                ans = 1.31;
                break;
            case "CHF":
                ans = 0.91;
                break;
            case "CNY":
                ans = 6.46;
                break;
            default:
                System.out.println("Такой валюты нет.");
                ans = 0;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите сумму: ");
        double amount = in.nextDouble();
        System.out.print("Введите изначальную валюту (USD, EUR, GBP, JPY, AUD, CAD, CHF, CNY): ");
        String currencyCode1 = in.next().toUpperCase();
        System.out.print("Введите валюту, в которую хотите перевести (USD, EUR, GBP, JPY, AUD, CAD, CHF, CNY): ");
        String currencyCode2 = in.next().toUpperCase();

        double rate = func(currencyCode1);

        double convertedAmount = amount / rate;

        rate = func(currencyCode2);
        convertedAmount = convertedAmount * rate;

        System.out.printf("%.2f %s = %.2f %s.", amount, currencyCode1, convertedAmount, currencyCode2);
    }
}
