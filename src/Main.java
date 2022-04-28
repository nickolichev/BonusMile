public class Main {
    public static void main(String[] args) {

        int price = 1_000; // цена билета
        int amount = 20; // за оплату каждых 20 руб начисляется бонусная 1 миля
        int mile = 1; // количество миль за каждые 20 руб оплаты

        int bonus = (price / amount);

        System.out.println("Вам начислено бонусных миль:" + bonus);
    }

}
