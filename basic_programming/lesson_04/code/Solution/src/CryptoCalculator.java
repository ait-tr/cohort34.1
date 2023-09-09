import java.lang.Math;

public class CryptoCalculator {

    static int coins = 12350; // Количество монет
    static double priceBuy = 0.27; // Цена покупки одной монеты
    static double todayPrice = 16.38; // Цена одной монеты сегодня
    static boolean needToPayTaxes = true; // Учитываем налог
    static double taxPercent = 23;

    public static void main(String[] args) {


        calculateTotalValue();
        calculateProfit();
        coinsForXProfit(1000);
        priceForXProfit(10);


    }

    public static void calculateTotalValue() {

        double totalSum = (double) coins * todayPrice; //Сколько получит денег на руки

        System.out.println("Всего с продажи Вася получит = " + totalSum + " евро.");


    }

    public static void calculateProfit() {

        double revenue = ((double) coins * todayPrice) - (double) coins * priceBuy; //Выручка

        if (needToPayTaxes) {
            revenue = applyTax(revenue);
            System.out.println("Выручка Васи после уплаты налога на прибыль= " + revenue + " евро");
            return;
        }

        System.out.println("Выручка Васи = " + revenue + " евро.");
    }

    public static void coinsForXProfit(int profit) {

        double totalSum = (double) coins * priceBuy; //Всего было потрачено денег на приобретение всех монет
        double tempRes = (profit + totalSum) / todayPrice; //Нужно учитывать, что тут помимо прибыли участвует сумма, которую мы потратили изначально при покупке
        int coinsCount = (int) Math.ceil(tempRes); // Я не знаю как по другому откруглить до большего целого числа, думаю такой вариант тоже пойдет

        System.out.println("Необходимо продать монет = " + coinsCount + " чтобы получить прибыль " + profit + " евро.");
    }

    public static void priceForXProfit(int profit) {

        double needPrice = ((double) profit + coins * priceBuy) / (double) coins;
        System.out.println("Необходимая цена монеты = " + needPrice + " чтобы получить прибыль " + profit + " евро.");


    }

    public static double applyTax(double sum) {

        return sum - sum * taxPercent / 100;

    }

        
}
