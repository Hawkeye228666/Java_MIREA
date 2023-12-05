package twentySecond;

public class Main {
    public static void main(String[] args) {
        // Создаем Абстрактные Фабрики для разных типов стульев
        ChairFactory victorianChairFactory = new VictorianChairFactory();
        ChairFactory multiFunctionalChairFactory = new MultiFunctionalChairFactory();
        ChairFactory magicChairFactory = new MagicChairFactory();

        // Создаем стулья с использованием фабрик
        Chair victorianChair = victorianChairFactory.createChair();
        Chair multiFunctionalChair = multiFunctionalChairFactory.createChair();
        Chair magicChair = magicChairFactory.createChair();

        // Клиент использует стулья
        Client client = new Client();
        client.sit(victorianChair);
        client.sit(multiFunctionalChair);
        client.sit(magicChair);
    }
}