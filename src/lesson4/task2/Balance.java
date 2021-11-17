package lesson4.task2;

public class Balance {
    int coins;

    public Balance (int coins) {
        this.coins = coins;
    }

    public void plus(int n){
        if (n > 0) {
            coins += n;
            System.out.println("Вы пополнили свои деньги на " + n);
        }
    }
    public void minus(int n){
        if (n > 0 && n <= coins) {
            coins -= n;
        }
    }
    public void realmoney(){
        System.out.println(coins / 100 +" рублей " + coins % 10 + " копеек");
    }
}
