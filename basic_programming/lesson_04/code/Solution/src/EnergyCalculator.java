import java.util.HashMap;
import java.util.Map;

public class EnergyCalculator {

    static double costPerKv = 0.15; // Стоимость КВтч
    static Map<String, Integer> map = new HashMap<String, Integer>();

    public enum Month {
        JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

        private final int daysInMonth;

        Month(int daysInMonth) {
            this.daysInMonth = daysInMonth;
        }

        public int getDaysInMonth() {
            return daysInMonth;
        }
    }

    public static void main(String[] args) {
        map.put("Холодильник", 150);
        map.put("Кондиционер", 2000);
        map.put("Телевизор", 300);
        map.put("Компьютер", 400);
        //Можно добавить ещё устройства

        printFirstMessage();
        calculateHourlyConsumption(costPerKv);
        calculateMonthlyCost(costPerKv, Month.JANUARY);

    }

    /**
     * Вывод в лог первого сообщения.
     */
    public static void printFirstMessage() {

        StringBuilder allMessage = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (allMessage.isEmpty()) {
                allMessage.append("Для прибора - ").append(entry.getKey().toLowerCase()).append(" ").append(entry.getValue()).append("Вт");
            } else {
                allMessage.append(" и для прибора - ").append(entry.getKey().toLowerCase()).append(" ").append(entry.getValue()).append("Вт");
            }
        }


        System.out.println(allMessage);
    }

    /**
     * Рассчет суммарной потребляемой мощность за один час.
     *
     * @param cost Цена за КВт.
     * @return Суммарная мощность.
     */
    public static void calculateHourlyConsumption(double cost) {

        int sum = getSumPerOneHour();
        System.out.println("Суммарная потребляемая мощность за час = " + sum + "Вт. = " + WattToKiloWatt(sum) + "кВт.");

    }

    /**
     * Рассчет стоимости электропотребления.
     *
     * @param cost  Цена за КВт.
     * @param month Месяц
     * @return Стоимость потребления за указанный месяц.
     */
    public static void calculateMonthlyCost(double cost, Month month) {

        int consumptionInOneHour = getSumPerOneHour();

        int totalInMonth = (consumptionInOneHour * 24) * month.daysInMonth;
        double result = WattToKiloWatt(totalInMonth) * costPerKv;
        char euro = 8364;

        System.out.println("Суммарная потребляемая мощность за месяц = " + totalInMonth + "Вт. = " + WattToKiloWatt(totalInMonth) + "кВт.");
        System.out.println("Стоимость кВтч = " + costPerKv);

        System.out.println("Необходимо оплатить: " + result + String.valueOf(euro));


    }

    /**
     * Перевод Ватт в Киловатт.
     *
     * @param watt Ватты.
     * @return Значение в КВт.
     */
    public static double WattToKiloWatt(int watt) {
        return (double) watt / 1000;
    }

    /**
     * Получение суммы мощностей потребления всех приборов за один час.
     *
     * @return Значение в КВт.
     */
    public static int getSumPerOneHour() {

        int sum = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }

        return sum;
    }

}
