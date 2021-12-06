package OOPtask.task1;

import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите тип карочки: 1 - дебетовая 2 - кредитная");
        int type = sc.nextInt();
        TypeofCard types = TypeofCard.CREDIT;
        if (type == 1){
            types = TypeofCard.DEBIT;
        }
        Card myCard = new Card(0,types);
        boolean flag = true;
        do {
            System.out.println("Введите 1 для пополнения, 2 для снятия и 3 для просмотра баланса, 0 для выхода");
            int click = sc.nextInt();
            switch (click) {
                case 1 -> {
                    System.out.println("Сколько вы ложите");
                    myCard.addMoney(sc.nextInt());

                }
                case 2 -> {
                    System.out.println("Сколько хотите снять?");
                    myCard.drawMoney(sc.nextInt());

                }
                case 3 -> myCard.lookMoney();
                case 0 -> {
                    flag = false;
                    System.out.println("Удачного дня");
                }
            }
        } while (flag);


    }
}
