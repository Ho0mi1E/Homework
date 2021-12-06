package OOPtask.task1;

public class Card {
    private int balance;
    private final TypeofCard typeofCard;

    public Card(int balance, TypeofCard typeofCard) {
        this.balance = balance;
        this.typeofCard = typeofCard;
    }

    public int getBalance() {
        return balance;
    }

    public TypeofCard getTypeofCard() {
        return typeofCard;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    void addMoney(int money){
        balance += money;
        System.out.println("Деньги зачислены");

    }
    void drawMoney(int money) {
        if (balance < money && typeofCard == TypeofCard.DEBIT) {
            System.out.println("Недостаточно средств ");
            return;

        }
        balance -=money;
        System.out.println("Деньги списаны");





    }
    void lookMoney(){
        System.out.println("Вот ваш баланс");
        System.out.println(getBalance() + "$");


    }
}

