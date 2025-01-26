public class Main {
    public static void main(String[] args) {

        int initialAccount = 790;
        int replenishmentAccount = 3450;

        int bonus;

        if (replenishmentAccount > 1000) {
            bonus = replenishmentAccount / 100;
        } else {
            bonus = 0;
        }

        System.out.println(" Общий баланс счета: " + (initialAccount + replenishmentAccount + bonus) + " руб.");
    System.out.println("Бонусный счет:" + bonus + " руб.");
    }
}
